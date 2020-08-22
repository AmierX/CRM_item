package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMOperation;

import java.util.List;

public interface SMOperationMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(SMOperation record);

    int insertSelective(SMOperation record);

    SMOperation selectByPrimaryKey(Integer oid);
    List<SMOperation> selectAllOperation(SMOperation smOperation);

    int updateByPrimaryKeySelective(SMOperation record);

    int updateByPrimaryKey(SMOperation record);
}