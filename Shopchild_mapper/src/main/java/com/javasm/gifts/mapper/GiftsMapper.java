package com.javasm.gifts.mapper;

import com.javasm.gifts.entity.Gifts;

import java.util.List;

public interface GiftsMapper {
    int deleteByPrimaryKey(Integer gid);
    int deleteByArr(String[] gidArr);
    int insert(Gifts record);

    int insertSelective(Gifts record);

    Gifts selectByPrimaryKey(Integer gid);
    List<Gifts> selectAllGifts(Gifts gifts);//按条件查询所有

    int updateByPrimaryKeySelective(Gifts record);

    int updateByPrimaryKey(Gifts record);


}