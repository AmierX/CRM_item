package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMSysdept;

import java.util.List;

public interface SMSysdeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SMSysdept record);

    int insertSelective(SMSysdept record);

    SMSysdept selectByPrimaryKey(Integer id);
    List<SMSysdept> selectAllDept(SMSysdept smSysdept);

    int updateByPrimaryKeySelective(SMSysdept record);

    int updateByPrimaryKey(SMSysdept record);
}