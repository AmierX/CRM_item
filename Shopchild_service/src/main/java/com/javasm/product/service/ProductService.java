package com.javasm.product.service;

import com.javasm.productManager.entity.ProductInfo;
import com.javasm.productManager.entity.YiLeiInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> selectByPage(int index, int size);


    int editInfo(ProductInfo productInfo);

    int deleteInfoById(Integer index);

    ProductInfo queryById(Integer sid);

    void add(ProductInfo productInfo, YiLeiInfo yiLeiInfo) throws  Exception;
}
