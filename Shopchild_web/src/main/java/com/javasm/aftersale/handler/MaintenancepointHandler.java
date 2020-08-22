package com.javasm.aftersale.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javasm.aftersale.entity.Maintenancepoint;
import com.javasm.aftersale.service.IMaintenancepointService;
import com.javasm.entity.ResponseBean;
import com.javasm.entity.StatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Maintenancepoint")
public class MaintenancepointHandler {

    @Resource
    private IMaintenancepointService maintenancepointService;

    @RequestMapping("show")
    @ResponseBody
    public PageInfo selectMaintenance(Maintenancepoint maintenancepoint, @RequestParam(defaultValue = "1") Integer pageNumber, @RequestParam(defaultValue = "5") Integer pageSize){
        PageHelper.startPage(pageNumber,pageSize);
        List<Maintenancepoint> maintenancepointList = maintenancepointService.selectMaintenances(maintenancepoint);
        PageInfo pageInfo = new PageInfo(maintenancepointList);
        return pageInfo;
    }

    @RequestMapping("add")
    @ResponseBody
    public ResponseBean addMaintenance(Maintenancepoint maintenancepoint){
        boolean b = maintenancepointService.addMaintenance(maintenancepoint);
        if(b){
            return new ResponseBean(StatusEnum.ADD_SUC,maintenancepoint);
        }else {
            return new ResponseBean(StatusEnum.ADD_ERROR);
        }
    }

    @RequestMapping("update")
    @ResponseBody
    public ResponseBean updateMaintenance(Maintenancepoint maintenancepoint){
        boolean b = maintenancepointService.updateMaintenance(maintenancepoint);
        if(b){
            return new ResponseBean(StatusEnum.UPDATE_SUC,maintenancepoint);
        }else {
            return new ResponseBean(StatusEnum.UPDATE_ERROR);
        }
    }


    @RequestMapping("delete")
    @ResponseBody
    public ResponseBean deleteMaintenance(String mids){
        boolean b = maintenancepointService.deleteMaintenance(mids.split(","));
        if(b){
            return new ResponseBean(StatusEnum.DELETE_SUC);
        }else {
            return new ResponseBean(StatusEnum.DELETE_ERROR);
        }
    }


}
