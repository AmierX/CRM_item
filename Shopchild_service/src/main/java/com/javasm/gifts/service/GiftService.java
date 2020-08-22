package com.javasm.gifts.service;

import com.javasm.gifts.entity.Gifts;

import java.util.List;

public interface GiftService {
    int deleteByPrimaryKey(Integer gid);
    int deleteByArr(String[] gidArr);
    int insert(Gifts record);

    int insertSelective(Gifts record);

    Gifts selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Gifts record);

    int updateByPrimaryKey(Gifts record);

    List<Gifts> selectAllGifts(Gifts gifts);
}
