package com.javasm.gifts.handerler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.B2C.entity.B2cSaleorder;
import com.javasm.B2C.service.B2CService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.gifts.entity.Gifts;
import com.javasm.gifts.service.GiftService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("gifts")
public class GiftsHanderler {
    @Resource
    private GiftService giftService;

    @RequestMapping("selectAll")
    @ResponseBody
    public PageInfo selectGifts(Gifts gifts, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<Gifts> giftsList = giftService.selectAllGifts(gifts);
        PageInfo pageInfo = new PageInfo(giftsList);
        return pageInfo;
    }
    @RequestMapping("addgift")
    @ResponseBody
    public ResponseBean addGift(Gifts gifts){
        int insert = giftService.insert(gifts);

        if(insert==1){
          return new ResponseBean(StatusEnum.ADD_SUC);
        }else{
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }

    }
    @RequestMapping("delgift")
    @ResponseBody
    public ResponseBean delGift(String gids){
        int insert = giftService.deleteByArr(gids.split(","));

        if(insert>0){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }else{
            return  new ResponseBean(StatusEnum.DELETE_ERROR);
        }

    }
    @RequestMapping("updateGift")
    @ResponseBody
    public ResponseBean updateGift(Gifts gifts){
        System.out.println(gifts);

       int i= giftService.updateByPrimaryKey(gifts);
        if(i>0){
            return new ResponseBean(StatusEnum.UPDATE_SUC);
        }else{
            return  new ResponseBean(StatusEnum.UPDATE_ERROR);
        }

    }
}
