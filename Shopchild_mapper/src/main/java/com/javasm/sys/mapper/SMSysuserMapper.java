package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMSysuser;

import java.util.List;

public interface SMSysuserMapper {
    int deleteByPrimaryKey(Integer uid);
    int deleteUsers(String[] uids);

    int insert(SMSysuser record);

    int insertSelective(SMSysuser record);

    SMSysuser selectByPrimaryKey(Integer uid);
    List<SMSysuser> selectUserBySMSysuser(SMSysuser smSysuser);

    int updateByPrimaryKeySelective(SMSysuser record);

    int updateByPrimaryKey(SMSysuser record);
}