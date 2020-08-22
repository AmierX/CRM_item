package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cReturnorder;
import com.javasm.B2C.entity.B2cShoporde;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface B2cReturnorderMapper {
    int deleteByPrimaryKey(Integer b2crId);

    int insert(B2cReturnorder record);

    int insertSelective(B2cReturnorder record);

    B2cReturnorder selectByPrimaryKey(Integer b2crId);
    List<B2cReturnorder> selectAllB2cReturnorder(B2cReturnorder b2cReturnorder);
    List<B2cReturnorder> selectB2cReturnorderByNum(@Param("b2crOrderNum") Integer b2crOrderNum);

    int updateByPrimaryKeySelective(B2cReturnorder record);

    int updateByPrimaryKey(B2cReturnorder record);
}