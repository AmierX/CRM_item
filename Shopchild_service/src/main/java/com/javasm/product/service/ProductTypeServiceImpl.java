package com.javasm.product.service;

import com.javasm.productManager.entity.ProductTypeInfo;
import com.javasm.productManager.mapper.ProductTypeInfoMapper;
import org.springframework.stereotype.Service;
import com.javasm.product.service.ProductTypeService;
import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Resource
    private ProductTypeInfoMapper productTypeInfoMapper;

    @Override
    public List<ProductTypeInfo> queryAllType() throws Exception{
        List<ProductTypeInfo> list=productTypeInfoMapper.queryAllType();
        return list;
    }

    @Override
    public int deleteInfo(Integer id) {
        return productTypeInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int editInfo(ProductTypeInfo productTypeInfo) {
        return productTypeInfoMapper.updateByPrimaryKey(productTypeInfo);
    }

    @Override
    public void add(ProductTypeInfo productTypeInfo) {
        productTypeInfoMapper.insert(productTypeInfo);
    }
}
