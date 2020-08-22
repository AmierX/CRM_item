package com.javasm.aftersale.mapper;

import com.javasm.aftersale.entity.Returnfactorychuku;

import java.util.List;

public interface ReturnfactorychukuMapper {
    int deleteByPrimaryKey(Integer id);
    int deleteChuKu(String[] cids);

    int insert(Returnfactorychuku record);

    int insertSelective(Returnfactorychuku record);

    Returnfactorychuku selectByPrimaryKey(Integer id);
    List<Returnfactorychuku> selectChuku(Returnfactorychuku returnfactorychuku);

    int updateByPrimaryKeySelective(Returnfactorychuku record);

    int updateByPrimaryKey(Returnfactorychuku record);
}