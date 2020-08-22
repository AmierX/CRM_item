package com.javasm.product.service;

import com.javasm.productManager.entity.YiLeiInfo;
import com.javasm.productManager.mapper.YiLeiInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class YiLeiServiceImpl  implements  YileiInfoService{
    @Resource
    YiLeiInfoMapper yiLeiInfoMapper;

    @Override
    public YiLeiInfo queryMidTable(Integer sid) {
        YiLeiInfo yiLeiInfo = yiLeiInfoMapper.queryBySid(sid);
        return  yiLeiInfo;
    }

    @Override
    public int tongguo(Integer sid) {
        return yiLeiInfoMapper.tongguo(sid);
    }

    @Override
    public int jujue(Integer sid) {
       return  yiLeiInfoMapper.jujue(sid);
    }
}
