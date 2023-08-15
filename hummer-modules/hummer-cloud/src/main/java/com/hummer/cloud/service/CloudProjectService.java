package com.hummer.cloud.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hummer.cloud.mapper.*;
import com.hummer.cloud.mapper.ext.ExtCloudProjectMapper;
import com.hummer.common.core.constant.CloudTaskConstants;
import com.hummer.common.core.constant.ResourceOperation;
import com.hummer.common.core.constant.ResourceTypeConstants;
import com.hummer.common.core.constant.TaskEnum;
import com.hummer.common.core.domain.*;
import com.hummer.common.core.domain.request.project.CloudGroupRequest;
import com.hummer.common.core.domain.request.rule.ScanGroupRequest;
import com.hummer.common.core.dto.*;
import com.hummer.common.core.exception.HRException;
import com.hummer.common.core.utils.BeanUtils;
import com.hummer.common.core.utils.LogUtil;
import com.hummer.common.core.utils.PlatformUtils;
import com.hummer.common.core.utils.UUIDUtil;
import com.hummer.system.api.IOperationLogService;
import com.hummer.system.api.ISystemProviderService;
import com.hummer.system.api.model.LoginUser;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.alibaba.fastjson.JSON.parseArray;

/**
 * @author harris
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CloudProjectService {

    @Autowired
    private ExtCloudProjectMapper extCloudProjectMapper;
    @Autowired
    private CloudProjectMapper cloudProjectMapper;
    @Autowired
    private CloudProjectLogMapper cloudProjectLogMapper;
    @Autowired
    private CloudGroupMapper cloudGroupMapper;
    @Autowired
    private CloudGroupLogMapper cloudGroupLogMapper;
    @Autowired
    private CloudProcessMapper cloudProcessMapper;
    @Autowired
    private CloudProcessLogMapper cloudProcessLogMapper;
    @Autowired
    private CloudTaskMapper cloudTaskMapper;
    @Autowired
    private CloudTaskItemMapper cloudTaskItemMapper;
    @Autowired
    private AccountMapper accountMapper;
    @Autowired
    private RuleGroupMapper ruleGroupMapper;
    @Autowired @Lazy
    private AccountService accountService;
    @Autowired @Lazy
    private CloudTaskService cloudTaskService;
    @Autowired
    private CommonThreadPool commonThreadPool;
    @DubboReference
    private IOperationLogService operationLogService;
    @DubboReference
    private ISystemProviderService systemProviderService;

    public List<CloudProjectDTO> getCloudProjectDTOs(CloudGroupRequest cloudGroupRequest) {
        return extCloudProjectMapper.getCloudProjectDTOs(cloudGroupRequest);
    }

    public CloudProjectDTO projectById(String projectId) {
        CloudGroupRequest cloudProject = new CloudGroupRequest();
        cloudProject.setId(projectId);
        List<CloudProjectDTO> list = extCloudProjectMapper.getCloudProjectDTOs(cloudProject);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return new CloudProjectDTO();
        }
    }

    public void deletes(List<String> ids, LoginUser loginUser) throws Exception {
        ids.forEach(id -> {
            try {
                deleteProject(id, loginUser);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        });
    }

    public void deleteProject(String projectId, LoginUser loginUser) {

        CloudProject cloudProject = cloudProjectMapper.selectByPrimaryKey(projectId);
        cloudProjectMapper.deleteByPrimaryKey(projectId);

        CloudProjectLogExample cloudProjectLogExample = new CloudProjectLogExample();
        cloudProjectLogExample.createCriteria().andProjectIdEqualTo(projectId);
        cloudProjectLogMapper.deleteByExample(cloudProjectLogExample);

        CloudGroupExample cloudGroupExample = new CloudGroupExample();
        cloudGroupExample.createCriteria().andProjectIdEqualTo(projectId);
        cloudGroupMapper.deleteByExample(cloudGroupExample);

        CloudGroupLogExample cloudGroupLogExample = new CloudGroupLogExample();
        cloudGroupLogExample.createCriteria().andProjectIdEqualTo(projectId);
        cloudGroupLogMapper.deleteByExample(cloudGroupLogExample);

        CloudProcessExample cloudProcessExample = new CloudProcessExample();
        cloudProcessExample.createCriteria().andProjectIdEqualTo(projectId);
        cloudProcessMapper.deleteByExample(cloudProcessExample);

        CloudProcessLogExample cloudProcessLogExample = new CloudProcessLogExample();
        cloudProcessLogExample.createCriteria().andProjectIdEqualTo(projectId);
        cloudProcessLogMapper.deleteByExample(cloudProcessLogExample);

        operationLogService.log(loginUser, projectId, cloudProject.getAccountName(), ResourceTypeConstants.CLOUD_PROJECT.name(), ResourceOperation.DELETE, "i18n_delete_cloud_project");
    }

    public List<CloudGroupDTO> getCloudGroupDTOs(CloudGroupRequest cloudGroup) {
        return extCloudProjectMapper.getCloudGroupDTOs(cloudGroup);
    }

    public CloudGroupDTO groupById(String groupId) {
        CloudGroupRequest cloudGroup = new CloudGroupRequest();
        cloudGroup.setId(groupId);
        List<CloudGroupDTO> list = extCloudProjectMapper.getCloudGroupDTOs(cloudGroup);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return new CloudGroupDTO();
        }
    }

    public void deleteGroups(List<String> ids, LoginUser loginUser) throws Exception {
        ids.forEach(id -> {
            try {
                deleteGroup(id, loginUser);
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        });
    }

    public void deleteGroup(String groupId, LoginUser loginUser) {

        CloudGroup cloudGroup = cloudGroupMapper.selectByPrimaryKey(groupId);
        cloudGroupMapper.deleteByPrimaryKey(groupId);

        CloudGroupLogExample cloudGroupLogExample = new CloudGroupLogExample();
        cloudGroupLogExample.createCriteria().andGroupIdEqualTo(groupId);
        cloudGroupLogMapper.deleteByExample(cloudGroupLogExample);

        operationLogService.log(loginUser, groupId, cloudGroup.getAccountName(), ResourceTypeConstants.CLOUD_GROUP.name(), ResourceOperation.DELETE, "i18n_delete_cloud_project");
    }

    public List<CloudProcessDTO> getCloudProcessDTOs(CloudProcess cloudProcess) {
        return extCloudProjectMapper.getCloudProcessDTOs(cloudProcess);
    }

    public CloudProcessDTO processById(String processId) {
        CloudProcess cloudProcess = new CloudProcess();
        cloudProcess.setId(processId);
        List<CloudProcessDTO> list = extCloudProjectMapper.getCloudProcessDTOs(cloudProcess);
        if (!list.isEmpty()) {
            return list.get(0);
        } else {
            return new CloudProcessDTO();
        }
    }

    public void scan(ScanGroupRequest request, LoginUser loginUser) throws Exception {

        commonThreadPool.addTask(() -> {
            try {
                AccountWithBLOBs account = accountMapper.selectByPrimaryKey(request.getAccountId());

                Integer scanId = systemProviderService.insertScanHistory(account, loginUser);

                CloudProject cloudProject = new CloudProject();
                String projectId = UUIDUtil.newUUID();
                cloudProject.setId(projectId);
                cloudProject.setAccountId(account.getId());
                cloudProject.setAccountName(account.getName());
                cloudProject.setCreator(loginUser.getUserName());
                cloudProject.setPluginId(account.getPluginId());
                cloudProject.setPluginIcon(account.getPluginIcon());
                cloudProject.setPluginName(account.getPluginName());
                cloudProject.setCreateTime(System.currentTimeMillis());
                cloudProject.setStatus(CloudTaskConstants.TASK_STATUS.APPROVED.name());

                cloudProjectMapper.insertSelective(cloudProject);

                for (Integer groupId : request.getGroups()) {
                    RuleGroup ruleGroup = ruleGroupMapper.selectByPrimaryKey(groupId);
                    CloudGroup cloudGroup = new CloudGroup();
                    cloudGroup.setProjectId(projectId);
                    cloudGroup.setAccountId(account.getId());
                    cloudGroup.setAccountName(account.getName());
                    cloudGroup.setPluginIcon(account.getPluginIcon());
                    cloudGroup.setPluginName(account.getPluginName());
                    cloudGroup.setCreateTime(System.currentTimeMillis());
                    cloudGroup.setCreator(loginUser.getUserName());
                    cloudGroup.setStatus(CloudTaskConstants.TASK_STATUS.APPROVED.name());
                    cloudGroup.setGroupId(groupId);
                    cloudGroup.setGroupDesc(ruleGroup.getDescription());
                    cloudGroup.setGroupName(ruleGroup.getName());
                    cloudGroup.setGroupFlag(ruleGroup.getFlag());
                    cloudGroup.setGroupLevel(cloudGroup.getGroupLevel());

                    cloudGroupMapper.insertSelective(cloudGroup);

                    QuartzTaskDTO dto = new QuartzTaskDTO();
                    dto.setAccountId(account.getId());
                    dto.setPluginId(account.getPluginId());
                    dto.setStatus(true);
                    List<RuleDTO> ruleDTOS = accountService.getRules(dto);
                    for (RuleDTO rule : ruleDTOS) {
                        this.dealTask(rule, scanId, account, loginUser);
                    }
                }
            } catch (Exception e) {
                LogUtil.error("{project scan}" + e.getMessage());
            }
        });

    }

    private String dealTask(RuleDTO rule, Integer scanId, AccountWithBLOBs account, LoginUser loginUser) {
        try {
            if (rule.getStatus() && !cloudTaskService.checkRuleTaskStatus(account.getId(), rule.getId(),
                    new String[]{CloudTaskConstants.TASK_STATUS.APPROVED.name(), CloudTaskConstants.TASK_STATUS.PROCESSING.name()})) {
                QuartzTaskDTO quartzTaskDTO = new QuartzTaskDTO();
                BeanUtils.copyBean(quartzTaskDTO, rule);
                List<SelectTag> selectTags = new LinkedList<>();
                SelectTag s = new SelectTag();
                s.setAccountId(account.getId());
                JSONArray array = parseArray(rule.getRegions() != null ? rule.getRegions() : account.getCheckRegions());
                JSONObject object;
                List<String> regions = new ArrayList<>();
                for (int i = 0; i < array.size(); i++) {
                    try {
                        object = array.getJSONObject(i);
                        String value = object.getString("regionId");
                        regions.add(value);
                    } catch (Exception e) {
                        String value = array.get(0).toString();
                        regions.add(value);
                    }
                }
                s.setRegions(regions);
                selectTags.add(s);
                quartzTaskDTO.setSelectTags(selectTags);
                quartzTaskDTO.setType("manual");
                quartzTaskDTO.setAccountId(account.getId());
                quartzTaskDTO.setTaskName(rule.getName());
                CloudTask cloudTask = cloudTaskService.saveManualTask(quartzTaskDTO, loginUser);
                if (PlatformUtils.isSupportCloudAccount(cloudTask.getPluginId())) {
                    systemProviderService.insertScanTaskHistory(cloudTask, scanId, cloudTask.getAccountId(), TaskEnum.cloudAccount.getType());
                }
                return cloudTask.getId();
            }
        } catch (Exception e) {
            HRException.throwException(e.getMessage());
        }
        return "";
    }

}