package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Maintenancepoint;
import com.javasm.aftersale.mapper.MaintenancepointMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MaintenancepointServiceImpl implements IMaintenancepointService{

    @Resource
    private MaintenancepointMapper maintenancepointMapper;

    @Override
    public List<Maintenancepoint> selectMaintenances(Maintenancepoint maintenancepoint) {
        return maintenancepointMapper.selectMaintenance(maintenancepoint);
    }

    @Override
    public boolean addMaintenance(Maintenancepoint maintenancepoint) {
        int i = maintenancepointMapper.insertSelective(maintenancepoint);
        return i>0?true:false;
    }

    @Override
    public boolean updateMaintenance(Maintenancepoint maintenancepoint) {
        int i = maintenancepointMapper.updateByPrimaryKeySelective(maintenancepoint);
        return i>0?true:false;
    }

    @Override
    public boolean deleteMaintenance(String[] mids) {
        int i = maintenancepointMapper.deleteMaintenance(mids);
        return i>0?true:false;
    }
}
