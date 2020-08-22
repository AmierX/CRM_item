package com.javasm.sys.service;

import com.javasm.sys.entity.SMAuthoritySysrole;

import java.util.List;

public interface SMAuthoritySysroleService {
    List<SMAuthoritySysrole> selectAllAuthority(SMAuthoritySysrole smAuthoritySysrole);

    boolean deleteAuthority(String[] aids);

    boolean insertSelective(SMAuthoritySysrole record);

    boolean updateByPrimaryKeySelective(SMAuthoritySysrole record);
}
