package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Returnfactorychuku;

import java.util.List;

public interface IReturnfactorychukuService {

    //查询返厂出库记录
    List<Returnfactorychuku> selectReturnchuku(Returnfactorychuku returnfactorychuku);
    //添加返厂出库记录
    boolean addChuKu(Returnfactorychuku returnfactorychuku);
    //修改返厂出库记录
    boolean updateChuKu(Returnfactorychuku returnfactorychuku);
    //删除返厂出库记录
    boolean deleteChuKu(String[] cids);

    //导出
    void exportExcel(Returnfactorychuku returnfactorychuku);

}
