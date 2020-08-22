package com.javasm.product.service;

import com.javasm.productManager.entity.GongYingShangInfo;

import java.util.List;

public interface GongYingShangService {
    public List<GongYingShangInfo> getAllInfo();

    int deleteInfo(Integer id);

    void edit(GongYingShangInfo gongYingShangInfo);

    void add(GongYingShangInfo gongYingShangInfo);
}
