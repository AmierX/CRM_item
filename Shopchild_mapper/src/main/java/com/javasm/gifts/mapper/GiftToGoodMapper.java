package com.javasm.gifts.mapper;

import com.javasm.gifts.entity.GiftToGood;

import java.util.List;

public interface GiftToGoodMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(GiftToGood record);

    int insertSelective(GiftToGood record);

    GiftToGood selectByPrimaryKey(Integer gid);
    List<GiftToGood> select(GiftToGood giftToGood);

    int updateByPrimaryKeySelective(GiftToGood record);

    int updateByPrimaryKey(GiftToGood record);
}