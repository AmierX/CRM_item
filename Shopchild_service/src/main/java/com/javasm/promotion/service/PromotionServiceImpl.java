package com.javasm.promotion.service;

import com.javasm.promotion.entity.Promotion;
import com.javasm.promotion.mapper.promotionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService{

    @Resource
    promotionMapper pm;

    @Override
    public List<Promotion> selectAllPromotion(Promotion promotion) {
        return pm.selectAllPromotion(promotion);
    }

    @Override
    public int addPromotion(Promotion promotion) {
        return pm.insert(promotion);
    }

    @Override
    public int updatePromotion(Promotion promotion) {
        return pm.updateByPrimaryKey(promotion);
    }

    @Override
    public int deletePromotion(Integer sid) {
        return pm.deleteByPrimaryKey(sid);
    }
}
