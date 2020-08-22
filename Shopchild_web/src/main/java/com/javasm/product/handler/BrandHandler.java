package com.javasm.product.handler;

import com.javasm.entity.ResponseBean;
import com.javasm.entity.TableResponseBean;
import com.javasm.product.service.BrandService;
import com.javasm.productManager.entity.BrandInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class BrandHandler {

    @Autowired
    private BrandService brandService;

    //添加
    @PostMapping("/brand/add")
    @ResponseBody
    public ResponseBean add(BrandInfo brandInfo){
        ResponseBean responseBean=new ResponseBean();
        brandService.add(brandInfo);
        responseBean.setMs("添加成功");
        responseBean.setStatus(200);
        return  responseBean;
    }


    @ResponseBody
    @RequestMapping("/brand/queryByPage")
    public TableResponseBean queryBrand(){
        TableResponseBean tableResponseBean=new TableResponseBean();
        try {
            List<BrandInfo> list= brandService.queryAllBrand();
            tableResponseBean.setTotal(list.size());
            tableResponseBean.setMs("查询成功");
            tableResponseBean.setRows(list);
            tableResponseBean.setStatus(200);
        } catch (Exception e){
            tableResponseBean.setMs("查询失败");
            tableResponseBean.setRows(null);
            tableResponseBean.setStatus(500);
        }
        return  tableResponseBean;
    }

    //删除信息
    @GetMapping("/brand/deleteInfo")
    @ResponseBody
    public ResponseBean deleteInfo(Integer id){
        ResponseBean responseBean=new ResponseBean();
        try {
            int result= brandService.deleteInfo(id);
            responseBean.setMs("删除成功");
            responseBean.setStatus(200);
        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("出现异常");
            e.printStackTrace();
        }

        return  responseBean;
    }

    //修改
    @PostMapping("/brand/editBrand")
    @ResponseBody
    public ResponseBean editBrand(BrandInfo brandInfo){
        ResponseBean responseBean=new ResponseBean();
        try {
            if (brandInfo==null){
                responseBean.setMs("修改失败");
                responseBean.setStatus(500);
            }else {
                int result=brandService.eidtBrand(brandInfo);
                responseBean.setMs("成功");
                responseBean.setStatus(200);
            }

        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("出现异常");
            e.printStackTrace();
        }
        System.out.println(responseBean);
        return responseBean;
    }

}
