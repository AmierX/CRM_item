package com.javasm.log;

import com.alibaba.fastjson.JSON;
import com.javasm.sys.entity.SMSyslog;
import com.javasm.sys.entity.SMSysuser;
import com.javasm.sys.service.SMSyslogService;
import com.javasm.utill.DateUtils;
import com.javasm.utill.RedisService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;

public class LogAspect {

    @Resource
    private ShardedJedisPool shardedJedisPool;
    @Resource
    private SMSyslogService smSyslogService;

    /**
     * 把日志通知织入到控制层去。
     *
     * @param jp
     * @return
     */
    //环绕通知方法
    public Object logAdvice(ProceedingJoinPoint jp) {
        //得到连接点方法上的LogAnno注解信息
        MethodSignature signature = (MethodSignature) jp.getSignature();//得到连接点对象
        Method method = signature.getMethod();//得到Method方法对象
        LogAnno annotation = method.getAnnotation(LogAnno.class);//反射得到该方法上的注解对象
        String mname = annotation.mname();
        String mtype = annotation.mtype();

        //操作结果
        String optionResult = "suc";

        String uname = "";

        Object proceed = null;
        try {
            //当前登录用户，注解信息,时间
            proceed = jp.proceed();//执行连接点方法

            //得到session中的用户信息,怎么在切面中得到HttpSession对象。RequestContextHolder（把请求对象保存到当前线程的ThreadLocal）
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            SMSysuser login_user = (SMSysuser) session.getAttribute("LOGIN_USER");
            uname = login_user.getUname();

        } catch (Throwable throwable) {
            optionResult = "fail";
        } finally {
            LogEntity e = new LogEntity();
            e.setMname(mname);
            e.setMtype(mtype);
            e.setOptionResult(optionResult);
            e.setOptionTime(DateUtils.getCurrentTime());
            e.setUname(uname);
            //服务端把验证码临时存储，以便登录进行校验。往redis中存数据
            ShardedJedis resource = shardedJedisPool.getResource();
            resource.lpush("LOG_LIST", JSON.toJSONString(e));

            SMSyslog smSyslog = new SMSyslog();
            smSyslog.setLname(uname);
            smSyslog.setLmodule(mname);
            smSyslog.setLcontext(mtype);
            boolean b = smSyslogService.updateByLnameSelective(smSyslog);

            return proceed;
        }
    }
}
