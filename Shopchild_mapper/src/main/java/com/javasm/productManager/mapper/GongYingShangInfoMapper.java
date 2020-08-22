package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.GongYingShangInfo;
import com.javasm.productManager.entity.GongYingShangInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GongYingShangInfoMapper {
    int countByExample(GongYingShangInfoExample example);

    int deleteByExample(GongYingShangInfoExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(GongYingShangInfo record);

    int insertSelective(GongYingShangInfo record);

    List<GongYingShangInfo> selectByExample(GongYingShangInfoExample example);

    GongYingShangInfo selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") GongYingShangInfo record, @Param("example") GongYingShangInfoExample example);

    int updateByExample(@Param("record") GongYingShangInfo record, @Param("example") GongYingShangInfoExample example);

    int updateByPrimaryKeySelective(GongYingShangInfo record);

    int updateByPrimaryKey(GongYingShangInfo record);

    List<GongYingShangInfo> getAllInfo();
}