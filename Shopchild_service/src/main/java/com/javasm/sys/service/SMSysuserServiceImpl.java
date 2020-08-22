package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysuser;
import com.javasm.sys.mapper.SMSysuserMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class SMSysuserServiceImpl implements SMSysuserService {
    @Resource
    private SMSysuserMapper smSysuserMapper;

    @Override
    public SMSysuser selectUserBySMSysuser(SMSysuser smSysuser) {
        List<SMSysuser> smSysusers = smSysuserMapper.selectUserBySMSysuser(smSysuser);
        System.out.println("smSysusers"+smSysusers);
        if (smSysusers != null && smSysusers.size() == 1){
            return smSysusers.get(0);
        }
        return null;
    }

    @Override
    public List<SMSysuser> selectALLUser(SMSysuser smSysuser) {
        return smSysuserMapper.selectUserBySMSysuser(smSysuser);
    }

    @Override
    public boolean insertSMSysuser(SMSysuser smSysuser) {
        int insert = smSysuserMapper.insert(smSysuser);
        if (insert > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean insertSelective(SMSysuser record) {
        int insert = smSysuserMapper.insertSelective(record);
        if (insert >0 ){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(SMSysuser record) {
        int update = smSysuserMapper.updateByPrimaryKeySelective(record);
        if (update > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUsers(String[] uids) {
        int delete = smSysuserMapper.deleteUsers(uids);
        if(delete > 0){
            return true;
        }
        return false;
    }
}
