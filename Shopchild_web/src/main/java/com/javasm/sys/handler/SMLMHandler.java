package com.javasm.sys.handler;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import com.javasm.sys.entity.SMAuthority;
import com.javasm.sys.entity.SMSysdept;
import com.javasm.sys.entity.SMSyslog;
import com.javasm.sys.entity.SMSysrole;
import com.javasm.sys.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("smlm")
public class SMLMHandler {
    //日志信息查询接口
    @Resource
    private SMSyslogService smSyslogService;

    /*--------------------------日志管理  start-----------------------------*/

    @GetMapping("smlminit")
    @ResponseBody
    public ResponseBean initsmrm(){
        List<SMSyslog> smSyslogs = smSyslogService.selectAllSyslog(null);
        Map<String,Object> returnMap = new HashMap<>();
        returnMap.put("smSyslogs",smSyslogs);
        return new ResponseBean(JSON.toJSON(returnMap));
    }


   // @LogAnno(mname="日志管理",mtype = "分页查询操作")
    @GetMapping
    @ResponseBody
    public PageInfo getRoles(@RequestParam(defaultValue = "1") Integer pageNumber, Integer pageSize, SMSyslog smSyslog){
        PageHelper.startPage(pageNumber,pageSize);
        List<SMSyslog> smSyslogs = smSyslogService.selectAllSyslog(smSyslog);
        PageInfo infos = new PageInfo(smSyslogs);//数据集，分页数据
        return infos;//json
    }

    /*--------------------------日志管理  end-----------------------------*/


}
