package com.javasm.product.handler;

import com.javasm.entity.ResponseBean;
import com.javasm.entity.TableResponseBean;
import com.javasm.product.service.PriceInfoService;
import com.javasm.product.service.ProductTypeService;
import com.javasm.productManager.entity.ProductTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ProductTypeHandler {

    @Autowired
    private ProductTypeService productTypeService;
    @RequestMapping("/type")
    @ResponseBody
    public TableResponseBean queryAllType(){
        TableResponseBean tableResponseBean=new TableResponseBean();
        try {
            List<ProductTypeInfo> list= productTypeService.queryAllType();
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
    //删除
    @GetMapping("/type/deleteInfo")
    @ResponseBody
    public ResponseBean deleteInfo(Integer id){
        ResponseBean responseBean=new ResponseBean();
        try {
            if (id==null){
                responseBean.setStatus(500);
                responseBean.setMs("用户id不能为空");
            }else {
                int result=productTypeService.deleteInfo(id);
                responseBean.setStatus(200);
                responseBean.setMs("删除成功");

            }

        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("出现异常");
            e.printStackTrace();
        }

        return  responseBean;
    }
    //修改
    @PostMapping("/type/editInfo")
    @ResponseBody
    public ResponseBean editInfo(ProductTypeInfo productTypeInfo){
        ResponseBean responseBean =new ResponseBean();
        try {
            int result=productTypeService.editInfo(productTypeInfo);
            responseBean.setStatus(200);
            responseBean.setMs("修改成功");
        } catch (Exception e) {
            responseBean.setStatus(500);
            responseBean.setMs("出现异常");
            e.printStackTrace();
        }
        return  responseBean;
    }

    //添加
    @PostMapping("/type/add")
    @ResponseBody
    public ResponseBean add(ProductTypeInfo productTypeInfo){
        ResponseBean responseBean=new ResponseBean();
        productTypeService.add(productTypeInfo);
        responseBean.setStatus(200);
        responseBean.setMs("添加成功");
        return  responseBean;
    }

}
