package com.javasm.sys.handler;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import com.javasm.sys.entity.*;
import com.javasm.sys.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("perToReport")
public class SMPerToReportHandler {
    //用户角色接口
    @Resource
    private SMSysroleService smSysroleService;
    //用户职务接口
    @Resource
    private SMSysdutyService smSysdutyService;
    //用户所属部门接口
    @Resource
    private SMSysdeptService smSysdeptService;
    //权限查询接口
    @Resource
    private SMAuthorityService smAuthorityService;
    //可执行操作查询接口
    @Resource
    private SMOperationService smOperationService;
    //用户信息接口
    @Resource
    private SMSysuserService smSysuserService;
    //权限信息查询接口
    @Resource
    private SMAuthoritySysroleService smAuthoritySysroleService;
    //权限报表查询接口
    @Resource
    private SMPerToReportService smPerToReportService;

    /*--------------------------权限报表  start-----------------------------*/
    @GetMapping("init")
    @ResponseBody
    public ResponseBean init(){
        List<SMSysdept> smSysdepts = smSysdeptService.selectAllDept(null);
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(null);
        List<SMSysduty> smSysduties = smSysdutyService.selectAllDuty(null);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smSysdepts",smSysdepts);
        returnMap.put("smSysroles",smSysroles);
        returnMap.put("smSysduties",smSysduties);
        return new ResponseBean(JSON.toJSON(returnMap));
    }

    @LogAnno(mname="权限报表管理",mtype = "分页查询操作")
    @GetMapping
    @ResponseBody
    public PageInfo getRoles(@RequestParam(defaultValue = "1") Integer pageNumber, Integer pageSize, SMPerToReport smPerToReport){
        PageHelper.startPage(pageNumber,pageSize);
        List<SMPerToReport> smPerToReports = smPerToReportService.selectAllPerToReport(smPerToReport);
        PageInfo infos = new PageInfo(smPerToReports);//数据集，分页数据
        return infos;//json
    }

    @LogAnno(mname="权限报表管理",mtype = "权限报表导出操作")
    //导出销售订单
    @GetMapping("exportexcel")
    @ResponseBody
    public ResponseBean exportExcel(SMPerToReport smPerToReport){
        smPerToReportService.exportExcel(null);
        return new ResponseBean(StatusEnum.OPERATION_SUC);
    }
    /*--------------------------权限报表  end-----------------------------*/


}
