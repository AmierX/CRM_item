package com.javasm.B2C.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.Page;
import com.javasm.B2C.entity.*;
import com.javasm.B2C.mapper.*;
import com.javasm.B2C.service.B2CService;
import com.javasm.utill.DateUtils;
import com.javasm.utill.RedisService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class B2CServiceImpl implements B2CService {

    @Resource
    B2cSaleorderMapper bsm;

    @Resource
    B2cShopordeMapper bshm;

    @Resource
    B2cReturnorderMapper brm;

    @Resource
    B2cReturngoodsMapper brgm;

    @Resource
    B2cGoodinfoMapper bgm;

    @Resource
    B2cAddresseeMapper bam;

    @Resource
    RedisService redisService;

    String selectSaleorderById = "selectSaleorderById:";
    String selectSaleorderByNum = "selectSaleorderByNum:";
    String selectAllB2cShopordeById = "selectAllB2cShopordeById:";
    String selectAllB2cShopordeByNum = "selectAllB2cShopordeByNum:";
    String selectB2cReturnorderByid = "selectB2cReturnorderByid:";
    String selectB2cReturnorderByNum = "selectB2cReturnorderByNum:";
    String selectOneSaleorderById = "selectOneSaleorderById:";
    String selectOneSaleorderByNum = "selectOneSaleorderByNum:";
    String selectReturngoodsById = "selectReturngoodsById:";
    String selectReturngoodsByNum = "selectReturngoodsByNum:";
    String selectGoodByNum = "selectGoodByNum:";
    String selectUserByNum = "selectUserByNum:";

    @Override
    public List<B2cSaleorder> selectAllSaleorder(B2cSaleorder b2cSaleorder) {

        if (b2cSaleorder.getB2cId() != null) {
            String returnData = redisService.get(selectSaleorderById + b2cSaleorder.getB2cId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectSaleorderById + b2cSaleorder.getB2cId().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectAllSaleorder(b2cSaleorder)));
                return bsm.selectAllSaleorder(b2cSaleorder);
            }
        }
        if (b2cSaleorder.getB2cNum() != null) {
            String returnData = redisService.get(selectSaleorderByNum + b2cSaleorder.getB2cNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectSaleorderByNum + b2cSaleorder.getB2cNum().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectAllSaleorder(b2cSaleorder)));
                return bsm.selectAllSaleorder(b2cSaleorder);
            }
        }
        return bsm.selectAllSaleorder(b2cSaleorder);
    }

    @Override
    public List<B2cShoporde> selectAllB2cShoporde(B2cShoporde b2cShoporde) {
        if (b2cShoporde.getB2cwId() != null) {
            String returnData = redisService.get(selectAllB2cShopordeById + b2cShoporde.getB2cwId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cShoporde>>(){});
            } else {
                redisService.setex(selectAllB2cShopordeById + b2cShoporde.getB2cwId().toString(), 60 * 60 * 24, JSON.toJSONString(bshm.selectAllB2cShoporde(b2cShoporde)));
                return bshm.selectAllB2cShoporde(b2cShoporde);
            }
        }
        if (b2cShoporde.getB2cwNum() != null) {
            String returnData = redisService.get(selectAllB2cShopordeByNum + b2cShoporde.getB2cwNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cShoporde>>(){});
            } else {
                redisService.setex(selectAllB2cShopordeByNum + b2cShoporde.getB2cwNum().toString(), 60 * 60 * 24, JSON.toJSONString(bshm.selectAllB2cShoporde(b2cShoporde)));
                return bshm.selectAllB2cShoporde(b2cShoporde);
            }
        }
        return bshm.selectAllB2cShoporde(b2cShoporde);
    }

    //注意出入库状态
    @Override
    public List<B2cSaleorder> selectAllOutSaleorder(B2cSaleorder b2cSaleorder) {
        if (b2cSaleorder.getB2cId() != null) {
            String returnData = redisService.get(selectSaleorderById + b2cSaleorder.getB2cId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectSaleorderById + b2cSaleorder.getB2cId().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectAllSaleorder(b2cSaleorder)));
                return bsm.selectAllSaleorder(b2cSaleorder);
            }
        }
        if (b2cSaleorder.getB2cNum() != null) {
            String returnData = redisService.get(selectSaleorderByNum + b2cSaleorder.getB2cNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectSaleorderByNum + b2cSaleorder.getB2cNum().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectAllSaleorder(b2cSaleorder)));
                return bsm.selectAllSaleorder(b2cSaleorder);
            }
        }
        return bsm.selectAllSaleorder(b2cSaleorder);
    }

    @Override
    public List<B2cReturnorder> selectAllB2cReturnorder(B2cReturnorder b2cReturnorder) {
        if (b2cReturnorder.getB2crId() != null) {
            String returnData = redisService.get(selectB2cReturnorderByid + b2cReturnorder.getB2crId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cReturnorder>>(){});
            } else {
                redisService.setex(selectB2cReturnorderByid + b2cReturnorder.getB2crId().toString(), 60 * 60 * 24, JSON.toJSONString(brm.selectAllB2cReturnorder(b2cReturnorder)));
                return brm.selectAllB2cReturnorder(b2cReturnorder);
            }
        }
        if (b2cReturnorder.getB2crOrderNum() != null) {
            String returnData = redisService.get(selectB2cReturnorderByNum + b2cReturnorder.getB2crOrderNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cReturnorder>>(){});
            } else {
                redisService.setex(selectB2cReturnorderByNum + b2cReturnorder.getB2crOrderNum().toString(), 60 * 60 * 24, JSON.toJSONString(brm.selectAllB2cReturnorder(b2cReturnorder)));
                return brm.selectAllB2cReturnorder(b2cReturnorder);
            }
        }
        return brm.selectAllB2cReturnorder(b2cReturnorder);
    }

    @Override
    public List<B2cSaleorder> selectOneSaleorder(B2cSaleorder b2cSaleorder) {
        if (b2cSaleorder.getB2cId() != null) {
            String returnData = redisService.get(selectOneSaleorderById + b2cSaleorder.getB2cId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectOneSaleorderById + b2cSaleorder.getB2cId().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectOneSaleorder(b2cSaleorder)));
                return bsm.selectOneSaleorder(b2cSaleorder);
            }
        }
        if (b2cSaleorder.getB2cNum() != null) {
            String returnData = redisService.get(selectOneSaleorderByNum + b2cSaleorder.getB2cNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cSaleorder>>(){});
            } else {
                redisService.setex(selectOneSaleorderByNum + b2cSaleorder.getB2cNum().toString(), 60 * 60 * 24, JSON.toJSONString(bsm.selectOneSaleorder(b2cSaleorder)));
                return bsm.selectOneSaleorder(b2cSaleorder);
            }
        }
        return bsm.selectOneSaleorder(b2cSaleorder);
    }

    @Override
    public List<B2cReturngoods> selectAllB2cReturngoods(B2cReturngoods b2cReturngoods) {
        if (b2cReturngoods.getB2crdNum() != null) {
            String returnData = redisService.get(selectReturngoodsById + b2cReturngoods.getB2crdNum().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cReturngoods>>(){});
            } else {
                redisService.setex(selectReturngoodsById + b2cReturngoods.getB2crdNum().toString(), 60 * 60 * 24, JSON.toJSONString(brgm.selectAllB2cReturngoods(b2cReturngoods)));
                return brgm.selectAllB2cReturngoods(b2cReturngoods);
            }
        }
        if (b2cReturngoods.getB2crdId() != null) {
            String returnData = redisService.get(selectReturngoodsByNum + b2cReturngoods.getB2crdId().toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cReturngoods>>(){});
            } else {
                List<B2cReturngoods> b2cReturngoods1 = brgm.selectAllB2cReturngoods(b2cReturngoods);
                redisService.setex(selectReturngoodsByNum + b2cReturngoods.getB2crdId().toString(), 60 * 60 * 24, JSON.toJSONString(b2cReturngoods1));
                return b2cReturngoods1;
            }
        }
        return null;
    }

    @Override
    public List<B2cGoodinfo> selectGoodByNum(Integer num) {
        if (num != null) {
            String returnData = redisService.get(selectGoodByNum + num.toString());
            if (returnData != null) {

//                List<B2cGoodinfo> b2cGoodinfos = JSON.parseArray(returnData, B2cGoodinfo.class);
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cGoodinfo>>(){});
            } else {
                List<B2cGoodinfo> b2cGoodinfos = bgm.selectGoodByNum(num);
                redisService.setex(selectGoodByNum + num.toString(), 60 * 60 * 24, JSON.toJSONString(b2cGoodinfos));
                return b2cGoodinfos;
            }
        }
        return null;
    }

    @Override
    public List<B2cAddressee> selectUserByNum(Integer adOrderNum) {
        if (adOrderNum != null) {
            String returnData = redisService.get(selectUserByNum + adOrderNum.toString());
            if (returnData != null) {
                return JSON.parseObject(returnData, new TypeReference<ArrayList<B2cAddressee>>(){});
            } else {
                List<B2cAddressee> returnList =  bam.selectUserByNum(adOrderNum);
                redisService.setex(selectUserByNum + adOrderNum.toString(), 60 * 60 * 24, JSON.toJSONString(returnList));
                return returnList;
            }
        }
        return null;
    }

    @Override
    @Transactional
    public Map<String, Object> SaleorderDetails(B2cSaleorder b2cSaleorder) {
        Map<String, Object> map = new ConcurrentHashMap<>();
        List<B2cSaleorder> Saleorder = bsm.selectOneSaleorder(b2cSaleorder);
        map.put("Saleorder", Saleorder);
        List<B2cAddressee> Addressee = bam.selectUserByNum(b2cSaleorder.getB2cNum());
        map.put("Addressee", Addressee);
        List<B2cGoodinfo> Goodinfo = bgm.selectGoodByNum(b2cSaleorder.getB2cNum());
        map.put("Goodinfo", Goodinfo);
        return map;
    }

    @Override
    @Transactional
    public Map<String, Object> returnOrderDetails(B2cSaleorder b2cSaleorder) {
        Map<String, Object> map = new ConcurrentHashMap<>();
        List<B2cSaleorder> Saleorder = bsm.selectOneSaleorder(b2cSaleorder);
        map.put("Saleorder", Saleorder);
        List<B2cAddressee> Addressee = bam.selectUserByNum(b2cSaleorder.getB2cNum());
        map.put("Addressee", Addressee);
        List<B2cGoodinfo> Goodinfo = bgm.selectGoodByNum(b2cSaleorder.getB2cNum());
        map.put("Goodinfo", Goodinfo);
        List<B2cReturngoods> B2cReturngoods = brgm.selectB2cReturngoodsByNum(b2cSaleorder.getB2cNum());
        map.put("Returgood", B2cReturngoods);
        List<B2cReturnorder> B2cReturnorders = brm.selectB2cReturnorderByNum(b2cSaleorder.getB2cNum());
        map.put("B2cReturnorders", B2cReturnorders);
        return map;
    }

    @Override
    public void exportExcel() {
        try {
            B2cSaleorder b = new B2cSaleorder();
            List<Map<String, String>> datas = new ArrayList<>();
            OutputStream out = new FileOutputStream("E:/testExcel/Saleorder.xlsx");
            Map<String, String> map;
            List<B2cSaleorder> Saleorders = bsm.selectAllSaleorder(b);
            String[] headers = new String[]{"序号", "订单编号", "订单类型", "订单动作", "业务类型", "支付方式", "配送方式", "订单状态"};
            for (B2cSaleorder d : Saleorders) {
                map = new HashMap<>();
                map.put("序号", d.getB2cId().toString());
                map.put("订单编号", d.getB2cNum().toString());
                map.put("订单类型", d.getB2cOrderType());
                map.put("订单动作", d.getB2cOrderHandle());
                map.put("业务类型", d.getB2cService());
                map.put("支付方式", d.getB2cPayType());
                map.put("配送方式", d.getB2cPost());
                map.put("订单状态", d.getB2corderStatus());
                datas.add(map);
            }
            Workbook wb = new XSSFWorkbook();//xlsx后缀
            //加数据
            Sheet sheet = wb.createSheet("销售订单详情");
            Row firstRow = sheet.createRow(0);//表 头行
            for (int i = 0; i < headers.length; i++) {
                Cell cell = firstRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            for (int i = 0; i < datas.size(); i++) {
                //开始一行
                //每行的map格式数据
                Map<String, String> rowMap = datas.get(i);
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < headers.length; j++) {
                    Cell cell = row.createCell(j);
                    cell.setCellValue(rowMap.get(headers[j]));
                }
            }
            wb.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Transactional
    @Override
    public void inputShopOrder(MultipartFile file) {
        try {
            B2cShoporde b2cShoporde;
            List<Object> list;
            Map<Integer, List> map = new LinkedHashMap<>();
            InputStream inputStream = file.getInputStream();
            Workbook workbook = WorkbookFactory.create(inputStream);//工作簿对象,整个excel文档对象
            Sheet sheet = workbook.getSheetAt(0);//sheet对象。
            int rowNum = sheet.getPhysicalNumberOfRows();//行数
            Row firstRow = sheet.getRow(0);//第一行,表头行
            int colsNum = firstRow.getPhysicalNumberOfCells();//列数

            for (int i = 0; i < colsNum; i++) {
                Cell cell = firstRow.getCell(i);
                String value = cell.getStringCellValue();
                System.out.print(value + "\t");
            }

            //遍历数据行
            for (int i = 1; i < rowNum; i++) {
                Row row = sheet.getRow(i);
                list = new ArrayList<>();
                //遍历当前行的每个单元格
                for (int j = 0; j < colsNum; j++) {
                    Cell cell = row.getCell(j);
                    //判断单元格类型
                    if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                        if (DateUtil.isCellDateFormatted(cell)) {
                            Date dateCellValue = cell.getDateCellValue();
                            String s = DateUtils.formatDateYMd(dateCellValue);
                            list.add(s);
                            System.out.print(s + "\t");
                        } else {
                            double value = cell.getNumericCellValue();
                            if (value == (int) value) {
                                list.add((int) value);
                                System.out.print((int) value + "\t");
                            } else {
                                //数值格式化对象
                                NumberFormat nf = NumberFormat.getInstance();
                                nf.setGroupingUsed(false);//数值三位分组
                                String str = nf.format(value);
                                list.add(str);
                                System.out.print(str + "\t");
                            }
                        }
                    } else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                        String value = cell.getStringCellValue();
                        list.add(value);
                        System.out.print(value + "\t");
                    }
                }
                map.put(i,list);
            }
            for (Map.Entry<Integer, List> entry:map.entrySet()){
                b2cShoporde = new B2cShoporde();
                b2cShoporde.setB2cwNum((int)(entry.getValue().get(1)));
                b2cShoporde.setB2cwOrderType((String)(entry.getValue().get(2)));
                b2cShoporde.setB2cwGoods((String)(entry.getValue().get(3)));
                b2cShoporde.setB2cwService((String)(entry.getValue().get(4)));
                b2cShoporde.setB2cwPayType((String)(entry.getValue().get(5)));
                b2cShoporde.setB2cwPost((String)(entry.getValue().get(6)));
                b2cShoporde.setB2cwPrderStatus((String)(entry.getValue().get(7)));
                bshm.insert(b2cShoporde);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
