package com.javasm.promotion.service;

import com.javasm.promotion.entity.Promotion;

import java.util.List;

public interface PromotionService {

    //查询促销活动
    List<Promotion> selectAllPromotion(Promotion promotion);

    //添加促销活动
    int addPromotion(Promotion promotion);

    //修改促销活动
    int updatePromotion(Promotion promotion);

    //删除促销活动
    int deletePromotion(Integer sid);

}
