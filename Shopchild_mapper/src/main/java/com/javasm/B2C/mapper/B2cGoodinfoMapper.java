package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cGoodinfo;
import com.javasm.B2C.entity.B2cSaleorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface B2cGoodinfoMapper {
    int deleteByPrimaryKey(Integer b2cgId);

    int insert(B2cGoodinfo record);

    int insertSelective(B2cGoodinfo record);

    B2cGoodinfo selectByPrimaryKey(Integer b2cgId);
    List<B2cGoodinfo> selectGoodByNum(@Param("b2cgOrderNum") Integer b2cgOrderNum);

    int updateByPrimaryKeySelective(B2cGoodinfo record);

    int updateByPrimaryKey(B2cGoodinfo record);
}