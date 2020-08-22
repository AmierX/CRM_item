package com.javasm.product.handler;

import com.javasm.entity.ResponseBean;
import com.javasm.entity.TableResponseBean;
import com.javasm.product.service.PriceInfoService;
import com.javasm.product.service.YileiInfoService;
import com.javasm.productManager.entity.YiLeiInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class YiLeiProductQueryHandler {
    @Autowired
    private PriceInfoService priceInfoService;
    @Autowired
    private YileiInfoService yileiInfoService;
    @RequestMapping("/priceInfo")
    @ResponseBody
    public TableResponseBean GetAllInfo(){
        TableResponseBean tableResponseBean=new TableResponseBean();
        try {
            List<YiLeiInfo> list = priceInfoService.getAllInfo();
            tableResponseBean.setStatus(200);
            tableResponseBean.setMs("查询成功");
            tableResponseBean.setRows(list);
            tableResponseBean.setTotal(list.size());
        } catch (Exception e) {
            tableResponseBean.setRows(null);
            tableResponseBean.setMs("查询失败");
            tableResponseBean.setStatus(500);
            e.printStackTrace();
        }


        return  tableResponseBean;
    }

    //审核通过
    @GetMapping("/priceInfo/shenHe")
    @ResponseBody
    public ResponseBean shenHe(Integer sid){
        ResponseBean responseBean=new ResponseBean();
        YiLeiInfo yiLeiInfo = yileiInfoService.queryMidTable(sid);
        if (yiLeiInfo==null){
            responseBean.setStatus(500);
            responseBean.setMs("没有该条记录");
        }else {
            yileiInfoService.tongguo(sid);
            responseBean.setStatus(200);
            responseBean.setMs("审核通过");
        }
         return  responseBean;
    }

    //审核不通过
    @GetMapping("/priceInfo/jujue")
    @ResponseBody
    public ResponseBean jujue(Integer sid){
        ResponseBean responseBean=new ResponseBean();
        YiLeiInfo yiLeiInfo = yileiInfoService.queryMidTable(sid);
        if (yiLeiInfo==null){
            responseBean.setStatus(500);
            responseBean.setMs("没有该条记录");
        }else {
            int result=yileiInfoService.jujue(sid);
            responseBean.setStatus(200);
            responseBean.setMs("审核拒绝成功");
        }
        return  responseBean;
    }
}
