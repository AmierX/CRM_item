package com.javasm.product.service;

import com.javasm.productManager.entity.ProductTypeInfo;

import java.util.List;

public interface ProductTypeService {


    List<ProductTypeInfo> queryAllType() throws  Exception;

    int deleteInfo(Integer id);

    int editInfo(ProductTypeInfo productTypeInfo);

    void add(ProductTypeInfo productTypeInfo);
}
