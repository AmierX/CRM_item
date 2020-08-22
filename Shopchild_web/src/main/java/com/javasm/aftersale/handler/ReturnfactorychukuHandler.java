package com.javasm.aftersale.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.aftersale.entity.Returnfactorychuku;
import com.javasm.aftersale.service.IReturnfactorychukuService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("Returnfactorychuku")
public class ReturnfactorychukuHandler {

    @Resource
    private IReturnfactorychukuService returnfactorychukuService;

    @RequestMapping("show")
    @ResponseBody
    public PageInfo selectChuKu(Returnfactorychuku returnfactorychuku, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Returnfactorychuku> returnfactorychukuList = returnfactorychukuService.selectReturnchuku(returnfactorychuku);
        PageInfo pageInfo = new PageInfo(returnfactorychukuList);
        return pageInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResponseBean addChuKu(Returnfactorychuku returnfactorychuku){
        returnfactorychuku.setZhidandate(new Date());
        boolean b = returnfactorychukuService.addChuKu(returnfactorychuku);
        if(b){
            return new ResponseBean(StatusEnum.ADD_SUC,returnfactorychuku);
        }else {
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseBean updateChuKu(Returnfactorychuku returnfactorychuku){
        boolean b = returnfactorychukuService.updateChuKu(returnfactorychuku);
        if(b){
            return new ResponseBean(StatusEnum.UPDATE_SUC,returnfactorychuku);
        }else {
            return new ResponseBean(StatusEnum.UPDATE_ERROR);
        }
    }


    @RequestMapping("delete")
    @ResponseBody
    public ResponseBean deleteChuKu(String mids){
        boolean b = returnfactorychukuService.deleteChuKu(mids.split(","));
        if(b){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }else {
            return new ResponseBean(StatusEnum.DELETE_ERROR);
        }
    }

    //导出销售订单
    @RequestMapping("exportexcel")
    @ResponseBody
    public ResponseBean exportExcel(Returnfactorychuku returnfactorychuku){
        returnfactorychukuService.exportExcel(returnfactorychuku);
        return new ResponseBean(StatusEnum.OPERATION_SUC);
    }



}
