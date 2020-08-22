package com.javasm.promotion.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import com.javasm.promotion.entity.Promotion;
import com.javasm.promotion.service.PromotionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("promotion")
public class Promotionhandler {

    @Resource
    PromotionService ps;

    @LogAnno(mname="promotion",mtype ="查询促销订单")
    @GetMapping
    @ResponseBody
    public PageInfo selectPromotion(Promotion promotion, @RequestParam(defaultValue = "1")Integer pageNumber,@RequestParam(defaultValue = "5")Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Promotion> promotions = ps.selectAllPromotion(promotion);
        PageInfo info = new PageInfo(promotions);
        return info;
    }

    @LogAnno(mname="promotion",mtype ="添加促销订单")
    @PostMapping
    @ResponseBody
    public ResponseBean addPromotion(Promotion promotion){
        int i = ps.addPromotion(promotion);
        return i>0?new ResponseBean(StatusEnum.ADD_SUC):new ResponseBean(StatusEnum.ADD_ERROR);
    }

    @LogAnno(mname="promotion",mtype ="删除促销订单")
    @DeleteMapping
    @ResponseBody
    public ResponseBean deletePromotion(Integer sid){
        int i = ps.deletePromotion(sid);
        return i>0?new ResponseBean(StatusEnum.DELETE_SUC):new ResponseBean(StatusEnum.DELETE_ERROR);
    }

    @LogAnno(mname="promotion",mtype ="修改促销订单")
    @PutMapping
    @ResponseBody
    public ResponseBean updatePromotion(Promotion promotion){
        int i = ps.updatePromotion(promotion);
        return i>0?new ResponseBean(StatusEnum.UPDATE_SUC):new ResponseBean(StatusEnum.UPDATE_ERROR);
    }

}
