package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.ProductInfo;
import com.javasm.productManager.entity.ProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);

    /**
     *
     * @param index 页码
     * @param size 页面条数
     * @return
     */
    List<ProductInfo> selectByPage(@Param("index") int index,@Param("size") int size);

    void add(ProductInfo productInfo);
}