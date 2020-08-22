package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysuser;

import java.util.List;

public interface SMSysuserService {
    SMSysuser selectUserBySMSysuser(SMSysuser smSysuser);
    List<SMSysuser> selectALLUser(SMSysuser smSysuser);

    boolean insertSMSysuser(SMSysuser smSysuser);
    boolean insertSelective(SMSysuser record);

    boolean updateByPrimaryKeySelective(SMSysuser record);

    boolean deleteUsers(String[] uids);
}
