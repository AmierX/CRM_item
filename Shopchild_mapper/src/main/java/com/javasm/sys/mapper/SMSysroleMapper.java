package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMSysrole;

import java.util.List;

public interface SMSysroleMapper {
    int deleteByPrimaryKey(Integer rid);
    int deleteRoles(String[] rids);

    int insert(SMSysrole record);

    int insertSelective(SMSysrole record);

    SMSysrole selectByPrimaryKey(Integer rid);
    List<SMSysrole> selectAllRole(SMSysrole smSysrole);

    int updateByPrimaryKeySelective(SMSysrole record);

    int updateByPrimaryKey(SMSysrole record);
}