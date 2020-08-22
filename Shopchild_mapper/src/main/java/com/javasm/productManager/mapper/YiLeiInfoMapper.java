package com.javasm.productManager.mapper;

import com.javasm.productManager.entity.YiLeiInfo;
import com.javasm.productManager.entity.YiLeiInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YiLeiInfoMapper {
    int countByExample(YiLeiInfoExample example);

    int deleteByExample(YiLeiInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YiLeiInfo record);

    int insertSelective(YiLeiInfo record);

    List<YiLeiInfo> selectByExample(YiLeiInfoExample example);

    YiLeiInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YiLeiInfo record, @Param("example") YiLeiInfoExample example);

    int updateByExample(@Param("record") YiLeiInfo record, @Param("example") YiLeiInfoExample example);

    int updateByPrimaryKeySelective(YiLeiInfo record);

    int updateByPrimaryKey(YiLeiInfo record);

    List<YiLeiInfo> getAllInfo();

    //根据sid,做中间表查询
    YiLeiInfo queryBySid(@Param("sid") Integer sid);

    //审核通过
    int tongguo(@Param("sid") Integer sid);

    //拒绝通过
    int jujue(@Param("sid") Integer sid);

    void addwithJiLian(YiLeiInfo yiLeiInfo)throws  Exception;
}