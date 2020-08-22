package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysduty;
import com.javasm.sys.mapper.SMSysdutyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMSysdutyServiceImpl implements SMSysdutyService {
    @Resource
    private SMSysdutyMapper smSysdutyMapper;

    @Override
    public List<SMSysduty> selectAllDuty(SMSysduty smSysduty) {
        return smSysdutyMapper.selectAllDuty(smSysduty);
    }
}
