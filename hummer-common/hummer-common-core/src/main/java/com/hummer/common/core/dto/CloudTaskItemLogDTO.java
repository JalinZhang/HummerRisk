package com.hummer.common.core.dto;


import com.hummer.common.core.domain.CloudTaskItem;
import com.hummer.common.core.domain.CloudTaskItemLogWithBLOBs;
import com.hummer.common.core.domain.Rule;

import java.util.List;

public class CloudTaskItemLogDTO {
    private CloudTaskItem cloudTaskItem;
    private List<CloudTaskItemLogWithBLOBs> cloudTaskItemLogList;
    private Rule rule;

    public CloudTaskItem getCloudTaskItem() {
        return cloudTaskItem;
    }

    public void setCloudTaskItem(CloudTaskItem cloudTaskItem) {
        this.cloudTaskItem = cloudTaskItem;
    }

    public List<CloudTaskItemLogWithBLOBs> getCloudTaskItemLogList() {
        return cloudTaskItemLogList;
    }

    public void setCloudTaskItemLogList(List<CloudTaskItemLogWithBLOBs> cloudTaskItemLogList) {
        this.cloudTaskItemLogList = cloudTaskItemLogList;
    }

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }
}
