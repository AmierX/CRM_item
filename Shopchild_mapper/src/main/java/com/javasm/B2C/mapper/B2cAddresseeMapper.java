package com.javasm.B2C.mapper;

import com.javasm.B2C.entity.B2cAddressee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface B2cAddresseeMapper {
    int deleteByPrimaryKey(Integer adId);

    int insert(B2cAddressee record);

    int insertSelective(B2cAddressee record);

    B2cAddressee selectByPrimaryKey(Integer adId);
    List<B2cAddressee> selectUserByNum(@Param("adOrderNum")Integer adOrderNum);

    int updateByPrimaryKeySelective(B2cAddressee record);

    int updateByPrimaryKey(B2cAddressee record);
}