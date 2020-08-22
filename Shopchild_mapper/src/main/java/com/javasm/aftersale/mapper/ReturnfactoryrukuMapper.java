package com.javasm.aftersale.mapper;

import com.javasm.aftersale.entity.Returnfactoryruku;

import java.util.List;

public interface ReturnfactoryrukuMapper {
    int deleteByPrimaryKey(Integer id);
    int deleteRuKu(String[] rids);

    int insert(Returnfactoryruku record);

    int insertSelective(Returnfactoryruku record);

    Returnfactoryruku selectByPrimaryKey(Integer id);
    List<Returnfactoryruku> selectRuKus(Returnfactoryruku returnfactoryruku);

    int updateByPrimaryKeySelective(Returnfactoryruku record);

    int updateByPrimaryKey(Returnfactoryruku record);
}