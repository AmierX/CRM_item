package com.javasm.B2C.handler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.B2C.entity.*;
import com.javasm.B2C.service.B2CService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import com.javasm.log.LogAnno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("B2C")
public class SalesOrderHandler {

    @Resource
    private B2CService bs;

    //查询订单内商品
    @GetMapping("selectgoods")
    @ResponseBody
    public PageInfo selectGood(Integer b2cNum, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "10") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cGoodinfo> b2cGoodinfos = bs.selectGoodByNum(b2cNum);
        PageInfo info = new PageInfo(b2cGoodinfos);
        return info;
    }

    //查询销售订单
    @LogAnno(mname="B2C",mtype ="查询销售订单")
    @GetMapping("salesorder")
    @ResponseBody
    public PageInfo selectSales(B2cSaleorder b2cSaleorder, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cSaleorder> Saleorder = bs.selectAllSaleorder(b2cSaleorder);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //查询订单详情
    @GetMapping("salesorderdetails")
    @ResponseBody
    public ResponseBean salesOrderDetails(B2cSaleorder b2cSaleorder){
        Map<String,Object> returnData = bs.SaleorderDetails(b2cSaleorder);
        if(returnData!=null){
            return new ResponseBean(StatusEnum.OPERATION_SUC,JSON.toJSON(returnData));
        }
        return new ResponseBean(StatusEnum.OPERATION_ERROR);
    }

    //查询网店订单
    @LogAnno(mname="B2C",mtype ="查询网店订单")
    @GetMapping("shoporder")
    @ResponseBody
    public PageInfo shopOrder(B2cShoporde b2cShoporde, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cShoporde> Saleorder = bs.selectAllB2cShoporde(b2cShoporde);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //销售出库管理
    @LogAnno(mname="B2C",mtype ="销售出库管理")
    @GetMapping("outorder")
    @ResponseBody
    public PageInfo outOrder(B2cSaleorder b2cSaleorder,@RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        b2cSaleorder.setB2corderStatus("待出库");
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cSaleorder> Saleorder = bs.selectAllSaleorder(b2cSaleorder);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //出库单记录
    @LogAnno(mname="B2C",mtype ="出库单记录")
    @GetMapping("selectonesaleorder")
    @ResponseBody
    public PageInfo selectOneSaleOrder(B2cSaleorder b2cSaleorder, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cSaleorder> Saleorder = bs.selectOneSaleorder(b2cSaleorder);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //退货订单查询
    @LogAnno(mname="B2C",mtype ="退货订单查询")
    @GetMapping("returnorder")
    @ResponseBody
    public PageInfo returnOrder(B2cReturnorder b2cReturnorder, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cReturnorder> Saleorder = bs.selectAllB2cReturnorder(b2cReturnorder);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //退货单记录查询
    @LogAnno(mname="B2C",mtype ="退货单记录查询")
    @GetMapping("returnoneorder")
    @ResponseBody
    public PageInfo returnOneOrder(B2cReturngoods b2cReturngoods, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<B2cReturngoods> Saleorder = bs.selectAllB2cReturngoods(b2cReturngoods);
        PageInfo pageInfo = new PageInfo(Saleorder);
        return pageInfo;
    }

    //退货订单详情
    @LogAnno(mname="B2C",mtype ="退货订单详情")
    @GetMapping("returnorderdetails")
    @ResponseBody
    public ResponseBean returnOrderDetails(B2cSaleorder b2cSaleorder){
        Map<String,Object> returnData = bs.returnOrderDetails(b2cSaleorder);
        if(returnData!=null){
            return new ResponseBean(StatusEnum.OPERATION_SUC,JSON.toJSON(returnData));
        }
        return new ResponseBean(StatusEnum.OPERATION_ERROR);
    }

    //导出销售订单
    @LogAnno(mname="B2C",mtype ="导出销售订单")
    @PostMapping("exportexcel")
    @ResponseBody
    public ResponseBean exportExcel(@RequestBody List<B2cSaleorder> b2cSaleorders){
//        System.out.println(b2cSaleorders);
        bs.exportExcel();
        return new ResponseBean(StatusEnum.OPERATION_SUC);
    }

    //导入网店订单
    @LogAnno(mname="B2C",mtype ="导入网店订单")
    @PostMapping("inputshoporder")
    @ResponseBody
    public ResponseBean inputShopOrder(MultipartFile file){
        bs.inputShopOrder(file);
        return new ResponseBean(StatusEnum.OPERATION_SUC);
    }

}
