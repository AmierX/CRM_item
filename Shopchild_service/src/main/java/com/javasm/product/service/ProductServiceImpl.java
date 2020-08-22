package com.javasm.product.service;

import com.javasm.productManager.entity.ProductInfo;
import com.javasm.productManager.entity.YiLeiInfo;
import com.javasm.productManager.mapper.ProductInfoMapper;
import com.javasm.productManager.mapper.YiLeiInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductInfoMapper productInfoMapper;
    @Resource
    private YiLeiInfoMapper yiLeiInfoMapper;
    @Override
    public List<ProductInfo> selectByPage(int index, int size) {
        index=index-1;
        if (index<0){
            index=0;
        }
        return ( List<ProductInfo>)productInfoMapper.selectByPage(index,size);
    }

    @Override
    public int editInfo(ProductInfo productInfo) {

        return productInfoMapper.updateByPrimaryKey(productInfo);
    }

    @Override
    public int deleteInfoById(Integer index) {
        productInfoMapper.deleteByPrimaryKey(index);
        yiLeiInfoMapper.deleteByPrimaryKey(index);
        return 1;
    }

    @Override
    public ProductInfo queryById(Integer sid) {
        return productInfoMapper.selectByPrimaryKey(sid);
    }

    @Override
    public void add(ProductInfo productInfo, YiLeiInfo yiLeiInfo) throws Exception {
        productInfoMapper.add(productInfo);
        Integer sid = productInfo.getSid();
        System.out.println("插入记录返回自增主键=="+sid);
        yiLeiInfo.setSid(sid);
        yiLeiInfoMapper.addwithJiLian(yiLeiInfo);//JiLian级联添加
    }
}
