package com.javasm.sys.service;

import com.javasm.sys.entity.SMAuthority;

import java.util.List;

public interface SMAuthorityService {
    List<SMAuthority> selectAllAuthority(SMAuthority smAuthority);
}
