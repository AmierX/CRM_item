package com.javasm.aftersale.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.B2C.entity.B2cGoodinfo;
import com.javasm.B2C.mapper.B2cGoodinfoMapper;
import com.javasm.aftersale.entity.Salesreturn;
import com.javasm.aftersale.service.ISalesreturnService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("salesreturn")
public class SalesreturnHandler {

    @Resource
    private ISalesreturnService salesreturnService;
    @Resource
    private B2cGoodinfoMapper b2cGoodinfoMapper;

    @RequestMapping("show")
    @ResponseBody
    public PageInfo selectSalesReturn(Salesreturn salesreturn, @RequestParam(defaultValue = "1") Integer pageNumber,@RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Salesreturn> salesreturnList = salesreturnService.selectTuiHuo(salesreturn);
        PageInfo pageInfo = new PageInfo(salesreturnList);
        return pageInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResponseBean addTuiHuo(Salesreturn salesreturn){
        boolean b = salesreturnService.addTuiHuo(salesreturn);
        if(b){
            return new ResponseBean(StatusEnum.ADD_SUC,salesreturn);
        }else {
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseBean updateTuiHuo(Salesreturn salesreturn){
        boolean b = salesreturnService.updateTuiHuo(salesreturn);
        if(b){
            return new ResponseBean(StatusEnum.UPDATE_SUC,salesreturn);
        }else {
            return new ResponseBean(StatusEnum.UPDATE_ERROR);
        }
    }


    @RequestMapping("delete")
    @ResponseBody
    public ResponseBean deleteTuiHuo(String tids){
        boolean b = salesreturnService.deleteTuiHuo(tids.split(","));
        if(b){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }else {
            return new ResponseBean(StatusEnum.DELETE_ERROR);
        }
    }

    //根据订单编号查询商品信息
    @RequestMapping("selectGoodByNum")
    @ResponseBody
    public PageInfo selectGoodsByNum( @RequestParam(defaultValue = "1") Integer pageNumber,@RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        Salesreturn salesreturn = new Salesreturn();
        salesreturn.setApproveresult("已通过");
        List<Salesreturn> salesreturnList = salesreturnService.selectTuiHuo(salesreturn);
        List<B2cGoodinfo> b2cGoodinfos = new ArrayList<>();
        for(Salesreturn n:salesreturnList){
            List<B2cGoodinfo> b2cGoodinfo = b2cGoodinfoMapper.selectGoodByNum(n.getsnumber());
            b2cGoodinfos.add(b2cGoodinfo.get(0));
        }
        PageInfo pageInfo = new PageInfo(b2cGoodinfos);
        return pageInfo;
    }


}
