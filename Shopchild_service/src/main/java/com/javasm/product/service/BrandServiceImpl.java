package com.javasm.product.service;

import com.javasm.productManager.entity.BrandInfo;
import com.javasm.productManager.mapper.BrandInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BrandServiceImpl  implements  BrandService{

    @Resource
    private BrandInfoMapper brandInfoMapper;

    @Override
    public List<BrandInfo> queryAllBrand() {
        List<BrandInfo> list=brandInfoMapper.queryBrand();
        return list;
    }

    @Override
    public int deleteInfo(Integer id) {
        return brandInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int eidtBrand(BrandInfo brandInfo) {
        return brandInfoMapper.updateByPrimaryKey(brandInfo);
    }

    @Override
    public void add(BrandInfo brandInfo) {
        brandInfoMapper.insert(brandInfo);
    }
}
