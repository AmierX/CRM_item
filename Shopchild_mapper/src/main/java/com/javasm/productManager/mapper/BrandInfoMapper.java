package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.BrandInfo;
import com.javasm.productManager.entity.BrandInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandInfoMapper {
    int countByExample(BrandInfoExample example);

    int deleteByExample(BrandInfoExample example);

    int deleteByPrimaryKey(Integer brandid);

    int insert(BrandInfo record);

    int insertSelective(BrandInfo record);

    List<BrandInfo> selectByExample(BrandInfoExample example);

    BrandInfo selectByPrimaryKey(Integer brandid);

    int updateByExampleSelective(@Param("record") BrandInfo record, @Param("example") BrandInfoExample example);

    int updateByExample(@Param("record") BrandInfo record, @Param("example") BrandInfoExample example);

    int updateByPrimaryKeySelective(BrandInfo record);

    int updateByPrimaryKey(BrandInfo record);
//查询所有品牌
    List<BrandInfo> queryBrand();
}