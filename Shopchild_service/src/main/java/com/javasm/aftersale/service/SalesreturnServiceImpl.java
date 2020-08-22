package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Salesreturn;
import com.javasm.aftersale.mapper.SalesreturnMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalesreturnServiceImpl implements ISalesreturnService {

    @Resource
    private SalesreturnMapper salesreturnMapper;

    @Override
    public List<Salesreturn> selectTuiHuo(Salesreturn salesreturn) {
        return salesreturnMapper.selectSalesreturns(salesreturn);
    }

    @Override
    public boolean addTuiHuo(Salesreturn salesreturn) {
        int i = salesreturnMapper.insertSelective(salesreturn);
        return i>0?true:false;
    }

    @Override
    public boolean updateTuiHuo(Salesreturn salesreturn) {
        int i = salesreturnMapper.updateByPrimaryKeySelective(salesreturn);
        return i>0?true:false;
    }

    @Override
    public boolean deleteTuiHuo(String[] tids) {
        int i = salesreturnMapper.deleteTuiHuo(tids);
        return i>0?true:false;
    }
}
