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
@RequestMapping("smam")
public class SMAMHandler {
    //用户角色接口
    @Resource
    private SMSysroleService smSysroleService;
    //权限查询接口
    @Resource
    private SMAuthorityService smAuthorityService;
    //可执行操作查询接口
    @Resource
    private SMOperationService smOperationService;
    //权限信息查询接口
    @Resource
    private SMAuthoritySysroleService smAuthoritySysroleService;

    /*--------------------------权限管理  start-----------------------------*/
    @GetMapping("smaminit")
    @ResponseBody
    public ResponseBean initsmam(){
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(null);
        List<SMAuthority> smAuthorities = smAuthorityService.selectAllAuthority(null);
        List<SMOperation> smOperations = smOperationService.selectAllOperation(null);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smOperations",smOperations);
        returnMap.put("smSysroles",smSysroles);
        returnMap.put("smAuthorities",smAuthorities);
        return new ResponseBean(JSON.toJSON(returnMap));
    }

    @LogAnno(mname="权限管理",mtype = "分页查询操作")
    @GetMapping
    @ResponseBody
    public PageInfo getAuthorities(@RequestParam(defaultValue = "1") Integer pageNumber, Integer pageSize, SMAuthoritySysrole smAuthoritySysrole){
        PageHelper.startPage(pageNumber,pageSize);
        List<SMAuthoritySysrole> smAuthoritySysroles = smAuthoritySysroleService.selectAllAuthority(smAuthoritySysrole);
        PageInfo infos = new PageInfo(smAuthoritySysroles);//数据集，分页数据
        return infos;//json
    }

    @LogAnno(mname="权限管理",mtype = "添加权限操作")
    @GetMapping("addAuthority")
    @ResponseBody
    public ResponseBean addAuthority(SMAuthoritySysrole smAuthoritySysrole){
        boolean inserisok = smAuthoritySysroleService.insertSelective(smAuthoritySysrole);
        if (inserisok){
            return new ResponseBean(StatusEnum.ADD_SUC);
        }
        return new ResponseBean(StatusEnum.ADD_ERROR);
    }

    @LogAnno(mname="权限管理",mtype = "修改权限操作")
    @PutMapping
    @ResponseBody
    public ResponseBean updateAuthority(SMAuthoritySysrole smAuthoritySysrole){
        boolean updateisok = smAuthoritySysroleService.updateByPrimaryKeySelective(smAuthoritySysrole);
        if (updateisok){
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        }
        return new ResponseBean(StatusEnum.UPDATE_ERROR);
    }

    @LogAnno(mname="权限管理",mtype = "删除权限操作")
    @DeleteMapping
    @ResponseBody
    public ResponseBean deleteAuthorities(String aids){
        boolean deleteisok = smAuthoritySysroleService.deleteAuthority(aids.split(","));
        if (deleteisok){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }
        return new ResponseBean(StatusEnum.DELETE_ERROR);
    }
    /*--------------------------权限管理  end-----------------------------*/



}
