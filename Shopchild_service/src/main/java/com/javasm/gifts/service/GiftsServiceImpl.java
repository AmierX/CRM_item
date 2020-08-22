package com.javasm.gifts.service;

import com.javasm.gifts.entity.Gifts;
import com.javasm.gifts.mapper.GiftsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GiftsServiceImpl implements GiftService{
    @Resource
    private GiftsMapper giftsMapper;
    @Override
    public int deleteByPrimaryKey(Integer gid) {
        return giftsMapper.deleteByPrimaryKey(gid);
    }

    @Override
    public int deleteByArr(String[] gidArr) {
        return giftsMapper.deleteByArr(gidArr);
    }

    @Override
    public int insert(Gifts record) {
        return giftsMapper.insert(record);
    }

    @Override
    public int insertSelective(Gifts record) {
        return giftsMapper.insertSelective(record);
    }

    @Override
    public Gifts selectByPrimaryKey(Integer gid) {
        return giftsMapper.selectByPrimaryKey(gid);
    }

    @Override
    public int updateByPrimaryKeySelective(Gifts record) {
        return giftsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Gifts record) {
        return giftsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Gifts> selectAllGifts(Gifts gifts) {
        return giftsMapper.selectAllGifts(gifts);
    }
}
