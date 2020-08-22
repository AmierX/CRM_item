package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cReturngoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface B2cReturngoodsMapper {
    int deleteByPrimaryKey(Integer b2crdId);

    int insert(B2cReturngoods record);

    int insertSelective(B2cReturngoods record);

    B2cReturngoods selectByPrimaryKey(Integer b2crdId);
    List<B2cReturngoods> selectAllB2cReturngoods(B2cReturngoods b2cReturngoods);
    List<B2cReturngoods> selectB2cReturngoodsByNum(@Param("b2crdId") Integer b2crdId);

    int updateByPrimaryKeySelective(B2cReturngoods record);

    int updateByPrimaryKey(B2cReturngoods record);
}