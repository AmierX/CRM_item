package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cSaleorder;

import java.util.List;

public interface B2cSaleorderMapper {
    int deleteByPrimaryKey(Integer b2cid);

    int insert(B2cSaleorder record);

    int insertSelective(B2cSaleorder record);

    B2cSaleorder selectByPrimaryKey(Integer b2cid);
    List<B2cSaleorder> selectAllSaleorder(B2cSaleorder b2cSaleorder);
    List<B2cSaleorder> selectOneSaleorder(B2cSaleorder b2cSaleorder);

    int updateByPrimaryKeySelective(B2cSaleorder record);

    int updateByPrimaryKey(B2cSaleorder record);
}