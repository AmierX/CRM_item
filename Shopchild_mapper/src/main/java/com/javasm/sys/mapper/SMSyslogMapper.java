package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMSyslog;

import java.util.List;

public interface SMSyslogMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(SMSyslog record);

    int insertSelective(SMSyslog record);

    SMSyslog selectByPrimaryKey(Integer lid);
    List<SMSyslog> selectAllSyslog(SMSyslog smSyslog);

    int updateByLnameSelective(SMSyslog record);

    int updateByPrimaryKey(SMSyslog record);
}