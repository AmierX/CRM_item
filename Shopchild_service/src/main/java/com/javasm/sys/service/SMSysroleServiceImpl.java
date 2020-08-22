package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysrole;
import com.javasm.sys.mapper.SMSysroleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMSysroleServiceImpl implements SMSysroleService {
    @Resource
    private SMSysroleMapper smSysroleMapper;

    @Override
    public List<SMSysrole> selectAllRole(SMSysrole smSysrole) {
        return smSysroleMapper.selectAllRole(smSysrole);
    }

    @Override
    public boolean insertSelective(SMSysrole record) {
        int insert = smSysroleMapper.insertSelective(record);
        if (insert > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(SMSysrole record) {
        int update = smSysroleMapper.updateByPrimaryKeySelective(record);
        if (update > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRoles(String[] rids) {
        int delete = smSysroleMapper.deleteRoles(rids);
        if (delete > 0){
            return true;
        }
        return false;
    }
}
