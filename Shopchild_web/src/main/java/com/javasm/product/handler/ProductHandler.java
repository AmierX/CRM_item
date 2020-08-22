package com.javasm.product.handler;

import com.alibaba.fastjson.JSONObject;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.TableResponseBean;
import com.javasm.product.service.ProductService;
import com.javasm.product.service.YileiInfoService;
import com.javasm.productManager.entity.ProductInfo;
import com.javasm.productManager.entity.YiLeiInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Controller

public class ProductHandler {

    @Autowired
    private ProductService productService;
    @Autowired
    private YileiInfoService yileiInfoService;

    //添加
    @PostMapping("/product/add")
    @ResponseBody
    public ResponseBean add(ProductInfo productInfo,YiLeiInfo yiLeiInfo){

        ResponseBean responseBean=new ResponseBean();
        try {
            productInfo.setSstorecode(String.valueOf(new Date().getTime()));
            productService.add(productInfo,yiLeiInfo);
            responseBean.setStatus(200);
            responseBean.setMs("添加成功");
        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("添加失败");
            e.printStackTrace();
        }
        return  responseBean;
    }
    //查询porduct表
    @RequestMapping(value = "/product/queryByPage",method = RequestMethod.GET)
    @ResponseBody
    public TableResponseBean queryByPage(Integer startIndex,Integer pageSize){
      //  ResponseBean responseBean=new ResponseBean();
        TableResponseBean tableResponseBean=new TableResponseBean();
        try {
            int index=startIndex==null?0:startIndex;
            int size=pageSize==null?10:pageSize;
            List<ProductInfo>  list=productService.selectByPage(index,size);


            JSONObject jsonObject=new JSONObject();
            jsonObject.put("total",list.size());
            jsonObject.put("rows",list);
            tableResponseBean.setTotal(list.size());
            tableResponseBean.setMs("查询成功");
            tableResponseBean.setStatus(200);
            tableResponseBean.setRows(list);
        } catch (Exception e) {
            e.printStackTrace();
            tableResponseBean.setStatus(500);
            tableResponseBean.setMs("查询失败");
            tableResponseBean.setRows(null);

        }
        return tableResponseBean;
    }
    //查询中间表
    @GetMapping("/product/getYileiInfo")
    @ResponseBody
    public ResponseBean queryMidInfo(Integer id){
        ResponseBean responseBean=new ResponseBean();
        try {
            YiLeiInfo yiLeiInfo = yileiInfoService.queryMidTable(id);

            if (yiLeiInfo==null){
                responseBean.setStatus(500);

            }else {
                responseBean.setStatus(200);
            }
            System.err.println(yiLeiInfo);
            responseBean.setDatas(yiLeiInfo);
        } catch (Exception e) {
            responseBean.setStatus(500);
            e.printStackTrace();
        }
        return responseBean;
    }
   //修改信息
    @RequestMapping(value = "/product/editProduct",method = RequestMethod.POST)
    @ResponseBody
    public ResponseBean editProduct(  ProductInfo productInfo){//去掉@requsetBody并且去掉ajax请求里的dataType和contentType[因为会造成严格验证json格式]
        ResponseBean responseBean=new ResponseBean();
        System.out.println("进入控制层");
        System.out.println(productInfo.toString());
        try {
            int result= productService.editInfo(productInfo);
            responseBean.setMs("更新成功");
            responseBean.setStatus(200);
        } catch (Exception e) {
            responseBean.setMs("更新失败");
            responseBean.setStatus(500);
            e.printStackTrace();
        }


        return responseBean;
    }
    //删除信息
    @RequestMapping(value = "/product/deleteInfo",method=RequestMethod.GET)
    @ResponseBody
    public ResponseBean deleteInfo(  Integer id){
        ResponseBean responseBean=new ResponseBean();
        try {
            System.out.println("删除主键"+id);
            int result=productService.deleteInfoById(id);

            responseBean.setStatus(200);
            responseBean.setMs("删除成功");
        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("出现异常");
            e.printStackTrace();
        }

        return responseBean;
    }
    //单个查
    @GetMapping("/product/queryById")
    @ResponseBody
    public ResponseBean queryById(Integer sid){
        ResponseBean responseBean=new ResponseBean();
        try {
            ProductInfo productInfo= productService.queryById(sid);
            responseBean.setMs("查询成功");
            responseBean.setStatus(200);
            responseBean.setDatas(productInfo);
        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("异常");
            e.printStackTrace();
        }
        return  responseBean;
    }

}
