package com.javasm.aftersale.mapper;

import com.javasm.aftersale.entity.Salesreturn;

import java.util.List;

public interface SalesreturnMapper {
    int deleteByPrimaryKey(Integer id);
    int deleteTuiHuo(String[] tids);

    int insert(Salesreturn record);

    int insertSelective(Salesreturn record);

    Salesreturn selectByPrimaryKey(Integer id);
    List<Salesreturn> selectSalesreturns(Salesreturn salesreturn);

    int updateByPrimaryKeySelective(Salesreturn record);

    int updateByPrimaryKey(Salesreturn record);
}