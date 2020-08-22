package com.javasm.aftersale.mapper;

import com.javasm.aftersale.entity.Maintenancepoint;

import java.util.List;

public interface MaintenancepointMapper {
    int deleteByPrimaryKey(Integer id);
    int deleteMaintenance(String[] mids);

    int insert(Maintenancepoint record);

    int insertSelective(Maintenancepoint record);

    Maintenancepoint selectByPrimaryKey(Integer id);
    List<Maintenancepoint> selectMaintenance(Maintenancepoint maintenancepoint);

    int updateByPrimaryKeySelective(Maintenancepoint record);

    int updateByPrimaryKey(Maintenancepoint record);
}