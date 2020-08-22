package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cSaleorder;
import com.javasm.B2C.entity.B2cShoporde;

import java.util.List;

public interface B2cShopordeMapper {
    int deleteByPrimaryKey(Integer b2cwId);

    int insert(B2cShoporde record);

    int insertSelective(B2cShoporde record);

    B2cShoporde selectByPrimaryKey(Integer b2cwId);
    List<B2cShoporde> selectAllB2cShoporde(B2cShoporde b2cShoporde);

    int updateByPrimaryKeySelective(B2cShoporde record);

    int updateByPrimaryKey(B2cShoporde record);
}