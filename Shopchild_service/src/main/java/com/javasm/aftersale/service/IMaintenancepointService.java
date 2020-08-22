package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Maintenancepoint;

import java.util.List;

public interface IMaintenancepointService {

    //查询维修点
    List<Maintenancepoint> selectMaintenances(Maintenancepoint maintenancepoint);
    //添加维修点
    boolean addMaintenance(Maintenancepoint maintenancepoint);
    //修改维修点
    boolean updateMaintenance(Maintenancepoint maintenancepoint);
    //删除维修点
    boolean deleteMaintenance(String[] mids);
}
