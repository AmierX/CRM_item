package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMAuthoritySysrole;

import java.util.List;

public interface SMAuthoritySysroleMapper {
    int deleteByPrimaryKey(Integer aid);
    int deleteAuthority(String[] aids);

    int insert(SMAuthoritySysrole record);

    int insertSelective(SMAuthoritySysrole record);

    SMAuthoritySysrole selectByPrimaryKey(Integer aid);
    List<SMAuthoritySysrole> selectAllAuthority(SMAuthoritySysrole smAuthoritySysrole);

    int updateByPrimaryKeySelective(SMAuthoritySysrole record);

    int updateByPrimaryKey(SMAuthoritySysrole record);
}