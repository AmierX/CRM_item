package com.javasm.product.service;

import com.javasm.productManager.entity.YiLeiInfo;
import com.javasm.productManager.mapper.YiLeiInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PriceInfoServiceImpl implements  PriceInfoService{
    @Resource
    private YiLeiInfoMapper yiLeiInfoMapper;

    @Override
    public List<YiLeiInfo> getAllInfo() {
        List<YiLeiInfo> list=yiLeiInfoMapper.getAllInfo();
        return list;
    }
}
