package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.ProductTypeInfo;
import com.javasm.productManager.entity.ProductTypeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductTypeInfoMapper {
    int countByExample(ProductTypeInfoExample example);

    int deleteByExample(ProductTypeInfoExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(ProductTypeInfo record);

    int insertSelective(ProductTypeInfo record);

    List<ProductTypeInfo> selectByExample(ProductTypeInfoExample example);

    ProductTypeInfo selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") ProductTypeInfo record, @Param("example") ProductTypeInfoExample example);

    int updateByExample(@Param("record") ProductTypeInfo record, @Param("example") ProductTypeInfoExample example);

    int updateByPrimaryKeySelective(ProductTypeInfo record);

    int updateByPrimaryKey(ProductTypeInfo record);

    List<ProductTypeInfo> queryAllType();
}