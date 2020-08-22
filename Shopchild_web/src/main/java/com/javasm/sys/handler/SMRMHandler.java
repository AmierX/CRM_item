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
@RequestMapping("smrm")
public class SMRMHandler {
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

    /*--------------------------角色管理  start-----------------------------*/

    @GetMapping("smrminit")
    @ResponseBody
    public ResponseBean initsmrm(){
        List<SMSysdept> smSysdepts = smSysdeptService.selectAllDept(null);
        System.out.println("1");
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(null);
        System.out.println("2");
        List<SMAuthority> smAuthorities = smAuthorityService.selectAllAuthority(null);
        System.out.println("3");
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smSysdepts",smSysdepts);
        returnMap.put("smSysroles",smSysroles);
        returnMap.put("smAuthorities",smAuthorities);
        return new ResponseBean(JSON.toJSON(returnMap));
    }


    @LogAnno(mname="角色管理",mtype = "分页查询操作")
    @GetMapping
    @ResponseBody
    public PageInfo getRoles(@RequestParam(defaultValue = "1") Integer pageNumber, Integer pageSize, SMSysrole smSysrole){
        PageHelper.startPage(pageNumber,pageSize);
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(smSysrole);
        PageInfo infos = new PageInfo(smSysroles);//数据集，分页数据
        return infos;//json
    }

    @LogAnno(mname="角色管理",mtype = "添加角色操作")
    @GetMapping("addRole")
    @ResponseBody
    public ResponseBean addRole(SMSysrole smSysrole){
        boolean inserisok = smSysroleService.insertSelective(smSysrole);
        if (inserisok){
            return new ResponseBean(StatusEnum.ADD_SUC);
        }
        return new ResponseBean(StatusEnum.ADD_ERROR);
    }

    @LogAnno(mname="角色管理",mtype = "更新角色操作")
    @PutMapping
    @ResponseBody
    public ResponseBean updateRole(SMSysrole smSysrole){
        boolean updateisok = smSysroleService.updateByPrimaryKeySelective(smSysrole);
        if (updateisok){
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        }
        return new ResponseBean(StatusEnum.UPDATE_ERROR);
    }

    @LogAnno(mname="角色管理",mtype = "删除角色操作")
    @DeleteMapping
    @ResponseBody
    public ResponseBean deleteRoles(String rids){
        boolean deleteisok = smSysroleService.deleteRoles(rids.split(","));
        if (deleteisok){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }
        return new ResponseBean(StatusEnum.DELETE_ERROR);
    }
    /*--------------------------角色管理  end-----------------------------*/


}
