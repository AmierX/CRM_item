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
@RequestMapping("smum")
public class SMUMHandler {
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

    /*--------------------------用户管理  start-----------------------------*/

    @GetMapping("smuminit")
    @ResponseBody
    public ResponseBean initquery(){
        List<SMSysdept> smSysdepts = smSysdeptService.selectAllDept(null);
        List<SMSysduty> smSysduties = smSysdutyService.selectAllDuty(null);
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(null);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smSysdepts",smSysdepts);
        returnMap.put("smSysduties",smSysduties);
        returnMap.put("smSysroles",smSysroles);
        return new ResponseBean(JSON.toJSON(returnMap));
    }

    @LogAnno(mname="用户管理",mtype = "分页查询操作")
    @GetMapping
    @ResponseBody
    public PageInfo getUsers(@RequestParam(defaultValue = "1") Integer pageNumber, Integer pageSize, SMSysuser smSysuser){
        PageHelper.startPage(pageNumber,pageSize);
        List<SMSysuser> sysusers = smSysuserService.selectALLUser(smSysuser);
        PageInfo infos = new PageInfo(sysusers);//数据集，分页数据
        return infos;//json
    }

    @LogAnno(mname="用户管理",mtype = "添加用户操作")
    @GetMapping("adduser")
    @ResponseBody
    public ResponseBean addUser(SMSysuser smSysuser){
        boolean inserisok = smSysuserService.insertSelective(smSysuser);
        if (inserisok){
            return new ResponseBean(StatusEnum.ADD_SUC);
        }
        return new ResponseBean(StatusEnum.ADD_ERROR);
    }

    @LogAnno(mname="用户管理",mtype = "更新用户操作")
    @PutMapping
    @ResponseBody
    public ResponseBean updateUser(SMSysuser smSysuser){
        boolean updateisok = smSysuserService.updateByPrimaryKeySelective(smSysuser);
        if (updateisok){
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        }
        return new ResponseBean(StatusEnum.UPDATE_ERROR);
    }

    @LogAnno(mname="用户管理",mtype = "删除用户操作")
    @DeleteMapping
    @ResponseBody
    public ResponseBean deleteUsers(String uids){
        boolean deleteisok = smSysuserService.deleteUsers(uids.split(","));
        if (deleteisok){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }
        return new ResponseBean(StatusEnum.DELETE_ERROR);
    }
    /*--------------------------用户管理  end-----------------------------*/

}
