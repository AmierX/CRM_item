package com.javasm.gifts.service;

import com.javasm.gifts.entity.GiftToGood;

import java.util.List;

public interface GiftToGoodService {
    List<GiftToGood> select( GiftToGood giftToGood);
    int add(GiftToGood giftToGood);
    int delete(int gid);
    int update(GiftToGood giftToGood);
}
