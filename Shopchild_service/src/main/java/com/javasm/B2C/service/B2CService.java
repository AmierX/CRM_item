package com.javasm.B2C.service;

import com.javasm.B2C.entity.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface B2CService {

    //查询销售订单
    List<B2cSaleorder> selectAllSaleorder(B2cSaleorder b2cSaleorder);

    //查询网店订单
    List<B2cShoporde> selectAllB2cShoporde(B2cShoporde b2cShoporde);

    //查询出库记录->b2corderStatus为未出库的记录
    List<B2cSaleorder> selectAllOutSaleorder(B2cSaleorder b2cSaleorder);

    //查询退货记录
    List<B2cReturnorder> selectAllB2cReturnorder(B2cReturnorder b2cReturnorder);

    //查询出库单记录
    List<B2cSaleorder> selectOneSaleorder(B2cSaleorder b2cSaleorder);

    //查询退货单记录
    List<B2cReturngoods> selectAllB2cReturngoods(B2cReturngoods b2cReturngoods);

    //查看购物车/订单详情
    List<B2cGoodinfo> selectGoodByNum(Integer num);

    //查询买家信息
    List<B2cAddressee> selectUserByNum(Integer adOrderNum);

    //查询销售订单详情
    Map<String, Object> SaleorderDetails(B2cSaleorder b2cSaleorder);

    //查询退货详情表
    Map<String, Object> returnOrderDetails(B2cSaleorder b2cSaleorder);

    //销售订单导出excel
    void exportExcel();

    //导入网店订单
    void inputShopOrder(MultipartFile file);

}
