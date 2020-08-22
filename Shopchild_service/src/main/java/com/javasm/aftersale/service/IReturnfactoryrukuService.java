package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Returnfactoryruku;

import java.util.List;

public interface IReturnfactoryrukuService {

    List<Returnfactoryruku> selectRuKu(Returnfactoryruku returnfactoryruku);

    boolean addRuKu(Returnfactoryruku returnfactoryruku);

    boolean updateRuKu(Returnfactoryruku returnfactoryruku);

    boolean deleteRuKu(String[] rids);
}
