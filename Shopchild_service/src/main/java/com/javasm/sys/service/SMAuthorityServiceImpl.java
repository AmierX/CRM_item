package com.javasm.sys.service;

import com.javasm.sys.entity.SMAuthority;
import com.javasm.sys.mapper.SMAuthorityMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMAuthorityServiceImpl implements SMAuthorityService {
    @Resource
    private SMAuthorityMapper smAuthorityMapper;

    @Override
    public List<SMAuthority> selectAllAuthority(SMAuthority smAuthority) {
        return smAuthorityMapper.selectAllAuthority(smAuthority);
    }
}
