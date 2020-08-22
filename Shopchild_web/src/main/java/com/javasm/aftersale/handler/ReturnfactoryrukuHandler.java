package com.javasm.aftersale.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.aftersale.entity.Returnfactoryruku;
import com.javasm.aftersale.service.IReturnfactoryrukuService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Returnfactoryruku")
public class ReturnfactoryrukuHandler {

    @Resource
    private IReturnfactoryrukuService returnfactoryrukuService;


    @RequestMapping("show")
    @ResponseBody
    public PageInfo selectChuKu(Returnfactoryruku returnfactoryruku, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Returnfactoryruku> returnfactoryrukuList = returnfactoryrukuService.selectRuKu(returnfactoryruku);
        PageInfo pageInfo = new PageInfo(returnfactoryrukuList);
        return pageInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResponseBean addChuKu(Returnfactoryruku returnfactoryruku){
        boolean b = returnfactoryrukuService.addRuKu(returnfactoryruku);
        if(b){
            return new ResponseBean(StatusEnum.ADD_SUC,returnfactoryruku);
        }else {
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseBean updateChuKu(Returnfactoryruku returnfactoryruku){
        boolean b = returnfactoryrukuService.updateRuKu(returnfactoryruku);
        if(b){
            return new ResponseBean(StatusEnum.UPDATE_SUC,returnfactoryruku);
        }else {
            return new ResponseBean(StatusEnum.UPDATE_ERROR);
        }
    }


    @RequestMapping("delete")
    @ResponseBody
    public ResponseBean deleteChuKu(String mids){
        boolean b = returnfactoryrukuService.deleteRuKu(mids.split(","));
        if(b){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }else {
            return new ResponseBean(StatusEnum.DELETE_ERROR);
        }
    }

}
