package com.javasm.product.service;

import com.javasm.productManager.entity.GongYingShangInfo;
import com.javasm.productManager.mapper.GongYingShangInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GongYingShangServiceImpl implements  GongYingShangService{
    @Resource
    private GongYingShangInfoMapper gongYingShangInfoMapper;
    public List<GongYingShangInfo> getAllInfo(){
        List<GongYingShangInfo> allInfo = gongYingShangInfoMapper.getAllInfo();
        return  allInfo;

    }

    @Override
    public int deleteInfo(Integer id) {
        return gongYingShangInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void edit(GongYingShangInfo gongYingShangInfo) {
        gongYingShangInfoMapper.updateByPrimaryKey(gongYingShangInfo);
    }

    @Override
    public void add(GongYingShangInfo gongYingShangInfo) {
        gongYingShangInfoMapper.insert(gongYingShangInfo);
    }
}
