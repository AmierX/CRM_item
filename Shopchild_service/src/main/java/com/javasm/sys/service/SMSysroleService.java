package com.javasm.sys.service;


import com.javasm.sys.entity.SMSysrole;

import java.util.List;

public interface SMSysroleService {
    List<SMSysrole> selectAllRole(SMSysrole smSysrole);

    boolean insertSelective(SMSysrole record);

    boolean updateByPrimaryKeySelective(SMSysrole record);

    boolean deleteRoles(String[] rids);
}
