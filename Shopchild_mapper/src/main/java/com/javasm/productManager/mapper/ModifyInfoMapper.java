package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.ModifyInfo;
import com.javasm.productManager.entity.ModifyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModifyInfoMapper {
    int countByExample(ModifyInfoExample example);

    int deleteByExample(ModifyInfoExample example);

    int deleteByPrimaryKey(Integer rid);

    int insert(ModifyInfo record);

    int insertSelective(ModifyInfo record);

    List<ModifyInfo> selectByExample(ModifyInfoExample example);

    ModifyInfo selectByPrimaryKey(Integer rid);

    int updateByExampleSelective(@Param("record") ModifyInfo record, @Param("example") ModifyInfoExample example);

    int updateByExample(@Param("record") ModifyInfo record, @Param("example") ModifyInfoExample example);

    int updateByPrimaryKeySelective(ModifyInfo record);

    int updateByPrimaryKey(ModifyInfo record);
}