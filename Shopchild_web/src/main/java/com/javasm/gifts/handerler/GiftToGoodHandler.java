package com.javasm.gifts.handerler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.gifts.entity.GiftToGood;

import com.javasm.gifts.service.GiftToGoodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("giftToGood")
public class GiftToGoodHandler {
    @Resource
    private GiftToGoodService giftToGoodService;

    @RequestMapping("select")
    @ResponseBody
    public PageInfo select(GiftToGood giftToGood, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<GiftToGood> giftsList = giftToGoodService.select(giftToGood);
        PageInfo pageInfo = new PageInfo(giftsList);
        return pageInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResponseBean add(GiftToGood giftToGood) {
        int insert = giftToGoodService.add(giftToGood);
        if (insert == 1) {
            return new ResponseBean(StatusEnum.ADD_SUC);
        } else {
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }

    }

    @RequestMapping("delete")
    @ResponseBody
    public ResponseBean delGift(String gids) {
        Boolean flag = false;
        String[] gidStrs = gids.split(",");
        for(String s: gidStrs){
            giftToGoodService.delete(Integer.parseInt(s));
            flag = true;
        }
        if (flag) {
            return new ResponseBean(StatusEnum.DELETE_SUC);
        } else {
            return new ResponseBean(StatusEnum.DELETE_ERROR);
        }

    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseBean updateGift(GiftToGood giftToGood) {
        int i = giftToGoodService.update(giftToGood);
        if (i > 0) {
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        } else {
            return new ResponseBean(StatusEnum.UPDATE_ERROR);
        }
    }
}
