package com.hummerrisk.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.hummerrisk.base.domain.Package;
import com.hummerrisk.base.domain.*;
import com.hummerrisk.commons.utils.PageUtils;
import com.hummerrisk.commons.utils.Pager;
import com.hummerrisk.controller.handler.annotation.I18n;
import com.hummerrisk.controller.request.packageSetting.PackageRequest;
import com.hummerrisk.controller.request.packageSetting.PackageResultRequest;
import com.hummerrisk.controller.request.packageSetting.PackageRuleRequest;
import com.hummerrisk.dto.PackageDTO;
import com.hummerrisk.dto.PackageResultDTO;
import com.hummerrisk.dto.PackageResultWithBLOBsDTO;
import com.hummerrisk.dto.PackageRuleDTO;
import com.hummerrisk.service.PackageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "软件包管理")
@RestController
@RequestMapping(value = "package")
public class
PackageController {

    @Resource
    private PackageService packageService;

    @I18n
    @ApiOperation(value = "软件包列表")
    @PostMapping("packageList/{goPage}/{pageSize}")
    public Pager<List<PackageDTO>> packageList(
            @PathVariable int goPage, @PathVariable int pageSize, @RequestBody PackageRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, packageService.packageList(request));
    }

    @ApiOperation(value = "添加软件包")
    @PostMapping("addPackage")
    public Package addPackage(@RequestBody Package p) throws Exception {
        return packageService.addPackage(p);
    }

    @ApiOperation(value = "编辑软件包")
    @PostMapping("editPackage")
    public Package editPackage(@RequestBody Package p) throws Exception {
        return packageService.editPackage(p);
    }

    @ApiOperation(value = "删除软件包")
    @GetMapping("deletePackage/{id}")
    public void deletePackage(@PathVariable String id) throws Exception {
        packageService.deletePackage(id);
    }

    @ApiOperation(value = "上传图片")
    @PostMapping(value = "uploadImg", consumes = {"multipart/form-data"})
    public Package uploadImg(@RequestPart(value = "file", required = true) MultipartFile file, @RequestPart("request") Package request) throws Exception {
        return packageService.uploadImg(file, request);
    }

    @ApiOperation(value = "上传软件包")
    @PostMapping(value = "uploadPackage", consumes = {"multipart/form-data"})
    public Package uploadPackage(@RequestPart(value = "file", required = true) MultipartFile file, @RequestPart("request") Package request) throws Exception {
        return packageService.uploadPackage(file, request);
    }

    @ApiOperation(value = "删除图片")
    @PostMapping("uploadImg/{id}")
    public void deleteImg(@PathVariable String id, @RequestBody PackageRequest p) throws Exception {
        packageService.deleteImg(id, p);
    }

    @ApiOperation(value = "删除软件包")
    @PostMapping("uploadPackage/{id}")
    public void deletePackage(@PathVariable String id, @RequestBody PackageRequest p) throws Exception {
        packageService.deleteFile(id, p);
    }

    @I18n
    @ApiOperation(value = "软件包规则列表")
    @PostMapping(value = "ruleList/{goPage}/{pageSize}")
    public Pager<List<PackageRuleDTO>> ruleList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody PackageRuleRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, packageService.ruleList(request));
    }

    @ApiOperation(value = "添加软件包规则")
    @PostMapping(value = "addPackageRule")
    public int addPackageRule(@RequestBody PackageRuleRequest request) throws Exception {
        return packageService.addPackageRule(request);
    }

    @ApiOperation(value = "修改软件包规则")
    @PostMapping(value = "updatePackageRule")
    public int updatePackageRule(@RequestBody PackageRuleRequest request) throws Exception {
        return packageService.updatePackageRule(request);
    }

    @ApiOperation(value = "删除软件包规则")
    @GetMapping(value = "deletePackageRule/{id}")
    public void deletePackageRule(@PathVariable String id) throws Exception  {
        packageService.deletePackageRule(id);
    }

    @ApiOperation(value = "软件包规则启用")
    @PostMapping(value = "changeStatus")
    public int changeStatus(@RequestBody PackageRule rule) throws Exception {
        return packageService.changeStatus(rule);
    }

    @ApiOperation(value = "检测软件包规则")
    @GetMapping("scan/{id}")
    public void scan(@PathVariable String id) throws Exception {
        packageService.scan(id);
    }

    @ApiOperation(value = "重新检测软件包规则")
    @GetMapping("reScan/{id}")
    public void reScan(@PathVariable String id) throws Exception {
        packageService.reScan(id);
    }

    @I18n
    @ApiOperation(value = "软件包检测结果列表")
    @PostMapping(value = "resultListWithBLOBs/{goPage}/{pageSize}")
    public Pager<List<PackageResultWithBLOBsDTO>> resultListWithBLOBs(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody PackageResultRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, packageService.resultListWithBLOBs(request));
    }

    @I18n
    @ApiIgnore
    @PostMapping(value = "resultList/{goPage}/{pageSize}")
    public Pager<List<PackageResultDTO>> resultList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody PackageResultRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, packageService.resultList(request));
    }

    @I18n
    @ApiOperation(value = "软件包检测结果")
    @GetMapping(value = "getPackageResult/{resultId}")
    public PackageResultWithBLOBs getPackageResult(@PathVariable String resultId) {
        return packageService.getPackageResult(resultId);
    }

    @I18n
    @ApiOperation(value = "软件包检测日志")
    @GetMapping(value = "log/{resultId}")
    public List<PackageResultLog> getPackageResultLog(@PathVariable String resultId) {
        return packageService.getPackageResultLog(resultId);
    }

    @ApiOperation(value = "删除软件包检测记录")
    @GetMapping("deletePackageResult/{id}")
    public void deletePackageResult(@PathVariable String id) throws Exception {
        packageService.deletePackageResult(id);
    }

    @I18n
    @ApiOperation(value = "检测结果详情")
    @PostMapping("resultItemList/{goPage}/{pageSize}")
    public Pager<List<PackageDependencyJsonWithBLOBs>> resultItemList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody PackageDependencyJson request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, packageService.resultItemList(request));
    }
}
