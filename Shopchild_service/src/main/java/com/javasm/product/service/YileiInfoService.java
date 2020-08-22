package com.javasm.product.service;

import com.javasm.productManager.entity.YiLeiInfo;

import java.util.List;

public interface YileiInfoService {

    YiLeiInfo queryMidTable(Integer sid);

    //审核通过
    int tongguo(Integer sid);
    //拒绝通过
    int jujue(Integer sid);
}
