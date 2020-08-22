package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysdept;
import com.javasm.sys.mapper.SMSysdeptMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMSysdeptServiceImpl implements SMSysdeptService {
    @Resource
    private SMSysdeptMapper smSysdeptMapper;

    @Override
    public List<SMSysdept> selectAllDept(SMSysdept smSysdept) {
        smSysdept.setDisok("是");
        return smSysdeptMapper.selectAllDept(smSysdept);
    }

    @Override
    public SMSysdept selectByPrimaryKey(Integer id) {
        return smSysdeptMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean insertSelective(SMSysdept record) {
        int insertSelective = smSysdeptMapper.insertSelective(record);
        if (insertSelective > 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(SMSysdept record) {
        int updateSelective = smSysdeptMapper.updateByPrimaryKeySelective(record);
        if (updateSelective > 0){
            return true;
        }
        return false;
    }
}
