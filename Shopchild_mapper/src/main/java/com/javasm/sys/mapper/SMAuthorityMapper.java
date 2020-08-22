package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMAuthority;

import java.util.List;

public interface SMAuthorityMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(SMAuthority record);

    int insertSelective(SMAuthority record);

    SMAuthority selectByPrimaryKey(Integer aid);
    List<SMAuthority> selectAllAuthority(SMAuthority smAuthority);

    int updateByPrimaryKeySelective(SMAuthority record);

    int updateByPrimaryKey(SMAuthority record);
}