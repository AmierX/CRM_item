package com.javasm.product.service;

import com.javasm.productManager.entity.BrandInfo;

import java.util.List;

public interface BrandService {
    List<BrandInfo> queryAllBrand();

    int deleteInfo(Integer id);

    int eidtBrand(BrandInfo brandInfo);

    void add(BrandInfo brandInfo);
}
