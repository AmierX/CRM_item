package com.javasm.sys.service;

import com.javasm.sys.entity.SMAuthoritySysrole;
import com.javasm.sys.mapper.SMAuthoritySysroleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMAuthoritySysroleServiceImpl implements SMAuthoritySysroleService {
    @Resource
    private SMAuthoritySysroleMapper smAuthoritySysroleMapper;

    @Override
    public List<SMAuthoritySysrole> selectAllAuthority(SMAuthoritySysrole smAuthoritySysrole) {
        return smAuthoritySysroleMapper.selectAllAuthority(smAuthoritySysrole);
    }

    @Override
    public boolean deleteAuthority(String[] aids) {
        int delete = smAuthoritySysroleMapper.deleteAuthority(aids);
        if (delete > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean insertSelective(SMAuthoritySysrole record) {
        int insert = smAuthoritySysroleMapper.insertSelective(record);
        if (insert > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(SMAuthoritySysrole record) {
        int update = smAuthoritySysroleMapper.updateByPrimaryKeySelective(record);
        if (update > 0){
            return true;
        }
        return false;
    }
}
