package com.javasm.product.handler;

import com.javasm.entity.ResponseBean;
import com.javasm.entity.TableResponseBean;
import com.javasm.product.service.GongYingShangService;
import com.javasm.productManager.entity.GongYingShangInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GongYingShangHandler {
    @Autowired
    private GongYingShangService gongYingShangService;
    @RequestMapping("/gongYingShang")
    @ResponseBody
    public TableResponseBean gongYingShangQuery(){
        TableResponseBean tableResponseBean=new TableResponseBean();
        try {
            List<GongYingShangInfo> list = gongYingShangService.getAllInfo();
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
    @GetMapping("/gongYingShang/deleteInfo")
    @ResponseBody
    public ResponseBean deleteInfo(Integer id){
        ResponseBean responseBean=new ResponseBean();
        int result=gongYingShangService.deleteInfo(id);
        try {
            responseBean.setMs("删除成功");
            responseBean.setStatus(200);
        } catch (Exception e) {
            responseBean.setMs("出现异常");
            responseBean.setStatus(500);
            e.printStackTrace();
        }
        return  responseBean;
    }

    //修改
    @PostMapping("/gongYingShang/edit")
    @ResponseBody
    public ResponseBean edit( GongYingShangInfo gongYingShangInfo){
        ResponseBean responseBean=new ResponseBean();
        gongYingShangService.edit(gongYingShangInfo);
        responseBean.setStatus(200);
        responseBean.setMs("更新成功");
        return  responseBean;
    }

    //添加
    @PostMapping("/gongYingShang/add")
    @ResponseBody
    public ResponseBean add(GongYingShangInfo gongYingShangInfo){
        ResponseBean responseBean=new ResponseBean();
        gongYingShangService.add(gongYingShangInfo);
        responseBean.setMs("添加成功");
        responseBean.setStatus(200);
        return  responseBean;
    }

}
