package com.javasm.sys.service;

import com.javasm.sys.entity.SMSyslog;

import java.util.List;

public interface SMSyslogService {

    boolean updateByLnameSelective(SMSyslog record);

    List<SMSyslog> selectAllSyslog(SMSyslog smSyslog);

    List<SMSyslog> selectLogFormat(SMSyslog smSyslog);
}
