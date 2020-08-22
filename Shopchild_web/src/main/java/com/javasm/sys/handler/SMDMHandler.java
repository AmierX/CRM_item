package com.javasm.sys.handler;

import com.alibaba.fastjson.JSON;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import com.javasm.sys.entity.SMSysdept;
import com.javasm.sys.entity.SMSysrole;
import com.javasm.sys.entity.SMSysuser;
import com.javasm.sys.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("smdm")
public class SMDMHandler {
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

    /*--------------------------部门管理  start-----------------------------*/

    @GetMapping("init")
    @ResponseBody
    public Object getRoles(){
        List<SMSysdept> smSysdepts = smSysdeptService.selectAllDept(new SMSysdept());
        Map<Object,List<Object>> returnMap = new HashMap<>();
        for (int i = 0;i<smSysdepts.size();i++){
            List<Object> returnList = new ArrayList<>();
            SMSysuser smSysuser = new SMSysuser();
            smSysuser.setUdept(smSysdepts.get(i).getDname());
            List<SMSysuser> smSysusers = smSysuserService.selectALLUser(smSysuser);
            returnList.add(smSysdepts.get(i));
            returnList.add(smSysusers.size());
            returnMap.put(i+"",returnList);
        }
        return JSON.toJSON(returnMap);//json
    }

    @GetMapping
    @ResponseBody
    public Object getRole(String id){
        SMSysdept smSysdept = smSysdeptService.selectByPrimaryKey(Integer.parseInt(id));
        Map<Object,Object> returnMap = new HashMap<>();
        returnMap.put("smSysdept",smSysdept);
        return JSON.toJSON(returnMap);//json
    }

    @LogAnno(mname="部门管理",mtype = "添加部门操作")
    @GetMapping("addDept")
    @ResponseBody
    public ResponseBean addRole(SMSysdept smSysdept){
        boolean insertisok = smSysdeptService.insertSelective(smSysdept);
        if (insertisok){
            return new ResponseBean(StatusEnum.ADD_SUC);
        }
        return new ResponseBean(StatusEnum.ADD_ERROR);
    }

    @LogAnno(mname="部门管理",mtype = "修改部门操作")
    @PutMapping
    @ResponseBody
    public ResponseBean updateRole(SMSysdept smSysdept){
        boolean updateisok = smSysdeptService.updateByPrimaryKeySelective(smSysdept);
        if (updateisok){
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        }
        return new ResponseBean(StatusEnum.UPDATE_ERROR);
    }


    /*--------------------------部门管理  end-----------------------------*/


}
