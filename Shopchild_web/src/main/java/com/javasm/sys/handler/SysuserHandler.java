package com.javasm.sys.handler;

import com.alibaba.fastjson.JSON;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import com.javasm.sys.entity.SMSysdept;
import com.javasm.sys.entity.SMSysduty;
import com.javasm.sys.entity.SMSysrole;
import com.javasm.sys.entity.SMSysuser;
import com.javasm.sys.service.SMSysdeptService;
import com.javasm.sys.service.SMSysdutyService;
import com.javasm.sys.service.SMSysroleService;
import com.javasm.sys.service.SMSysuserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class SysuserHandler {

    //按照类型去容器中找对象，SysuserinfoServiceImpl
    @Resource
    private SMSysuserService sysuserService;
    //用户角色接口
    @Resource
    private SMSysroleService smSysroleService;
    //用户职务接口
    @Resource
    private SMSysdutyService smSysdutyService;
    //用户所属部门接口
    @Resource
    private SMSysdeptService smSysdeptService;

    @GetMapping("userinit")
    @ResponseBody
    public ResponseBean initquery(){
        List<SMSysdept> smSysdepts = smSysdeptService.selectAllDept(new SMSysdept());
        List<SMSysduty> smSysduties = smSysdutyService.selectAllDuty(new SMSysduty());
        List<SMSysrole> smSysroles = smSysroleService.selectAllRole(new SMSysrole());
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smSysdepts",smSysdepts);
        returnMap.put("smSysduties",smSysduties);
        returnMap.put("smSysroles",smSysroles);
        return new ResponseBean(JSON.toJSON(returnMap));
    }

    @LogAnno(mname="系统登录",mtype = "登录操作")
    @RequestMapping
    @ResponseBody
    public ResponseBean login(SMSysuser sysuser, HttpSession session){
        System.out.println("sysuser"+sysuser);
        SMSysuser smSysuser = sysuserService.selectUserBySMSysuser(sysuser);
        session.setAttribute("LOGIN_USER",smSysuser);
        System.out.println("smSysuser"+smSysuser);
        if(smSysuser!=null){
            return new ResponseBean(StatusEnum.LOGIN_SUC,smSysuser);
        }
        return new ResponseBean(StatusEnum.LOGIN_FAILED,smSysuser);
    }

    @LogAnno(mname="系统登录",mtype = "添加用户操作")
    @RequestMapping("addUser")
    @ResponseBody
    public ResponseBean addUser(SMSysuser sysuserinfo){
        boolean result = sysuserService.insertSMSysuser(sysuserinfo);
        if(result){
            return new ResponseBean(StatusEnum.ADDUSER_SUC,sysuserinfo);
        }
        return new ResponseBean(StatusEnum.ADDUSER_FAILED,sysuserinfo);
    }
}
