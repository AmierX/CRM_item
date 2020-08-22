package com.javasm.promotion.mapper;

import com.javasm.promotion.entity.Promotion;

import java.util.List;

public interface promotionMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Promotion record);

    int insertSelective(Promotion record);

    Promotion selectByPrimaryKey(Integer sid);
    List<Promotion> selectAllPromotion(Promotion promotion);

    int updateByPrimaryKeySelective(Promotion record);

    int updateByPrimaryKey(Promotion record);
}