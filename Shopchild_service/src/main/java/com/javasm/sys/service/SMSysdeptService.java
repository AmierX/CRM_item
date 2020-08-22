package com.javasm.sys.service;

import com.javasm.sys.entity.SMSysdept;

import java.util.List;

public interface SMSysdeptService {
    List<SMSysdept> selectAllDept(SMSysdept smSysdept);

    SMSysdept selectByPrimaryKey(Integer id);

    boolean insertSelective(SMSysdept record);

    boolean updateByPrimaryKeySelective(SMSysdept record);
}
