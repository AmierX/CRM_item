package com.javasm.gifts.service;

import com.javasm.gifts.entity.GiftToGood;
import com.javasm.gifts.mapper.GiftToGoodMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GiftToGoodServiceImpl implements GiftToGoodService {
    @Resource
    private GiftToGoodMapper giftToGoodMapper;
    @Override
    public List<GiftToGood> select(GiftToGood giftToGood) {
        return giftToGoodMapper.select(giftToGood);
    }

    @Override
    public int add(GiftToGood giftToGood) {
        return giftToGoodMapper.insert(giftToGood);
    }

    @Override
    public int delete(int gid) {
        return giftToGoodMapper.deleteByPrimaryKey(gid);
    }

    @Override
    public int update(GiftToGood giftToGood) {
        return giftToGoodMapper.updateByPrimaryKeySelective(giftToGood);
    }
}
