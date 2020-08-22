package com.javasm.sys.service;

import com.javasm.sys.entity.SMSyslog;
import com.javasm.sys.mapper.SMSyslogMapper;
import com.javasm.utill.DateUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SMSyslogServiceImpl implements SMSyslogService {
    @Resource
    private SMSyslogMapper smSyslogMapper;

    @Override
    public boolean updateByLnameSelective(SMSyslog record) {
        int update = smSyslogMapper.updateByLnameSelective(record);
        if (update > 0){
            return true;
        }
        return false;
    }

    @Override
    public List<SMSyslog> selectAllSyslog(SMSyslog smSyslog) {
       return smSyslogMapper.selectAllSyslog(smSyslog);
    }

    @Override
    public List<SMSyslog> selectLogFormat(SMSyslog smSyslog) {
        List<SMSyslog> smSyslogs = smSyslogMapper.selectAllSyslog(smSyslog);
        List<SMSyslog> smSyslogs1 = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");

        for (SMSyslog syslog:smSyslogs){
            Date date = new Date(syslog.getLtime().getTime());
            String format = df.format(date);
            //syslog.setLtime(format);
            smSyslogs1.add(syslog);

        }
        return smSyslogs1;
    }


}
