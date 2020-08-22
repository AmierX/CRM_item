package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMSysduty;

import java.util.List;

public interface SMSysdutyMapper {
    int deleteByPrimaryKey(Integer duid);

    int insert(SMSysduty record);

    int insertSelective(SMSysduty record);

    SMSysduty selectByPrimaryKey(Integer duid);
    List<SMSysduty> selectAllDuty(SMSysduty smSysduty);

    int updateByPrimaryKeySelective(SMSysduty record);

    int updateByPrimaryKey(SMSysduty record);
}