package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Returnfactorychuku;
import com.javasm.aftersale.mapper.ReturnfactorychukuMapper;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReturnfactorychukuServiceImpl implements IReturnfactorychukuService{

    @Resource
    private ReturnfactorychukuMapper returnfactorychukuMapper;

    @Override
    public List<Returnfactorychuku> selectReturnchuku(Returnfactorychuku returnfactorychuku) {
        return returnfactorychukuMapper.selectChuku(returnfactorychuku);
    }

    @Override
    public boolean addChuKu(Returnfactorychuku returnfactorychuku) {
        int i = returnfactorychukuMapper.insertSelective(returnfactorychuku);
        return i>0?true:false;
    }

    @Override
    public boolean updateChuKu(Returnfactorychuku returnfactorychuku) {
        int i = returnfactorychukuMapper.updateByPrimaryKeySelective(returnfactorychuku);
        return i>0?true:false;
    }

    @Override
    public boolean deleteChuKu(String[] cids) {
        int i = returnfactorychukuMapper.deleteChuKu(cids);
        return i>0?true:false;
    }

    @Override
    public void exportExcel(Returnfactorychuku returnfactorychuku) {
        List<Map<String,String>> datas = new ArrayList<>();
        try {
            OutputStream out = new FileOutputStream("D:/返厂出库.xlsx");
            Map<String,String> map;
            List<Returnfactorychuku> returnfactorychukuList = returnfactorychukuMapper.selectChuku(returnfactorychuku);
            String[] strings = new String[]{"序号","返厂出库单号","返厂出库状态","制单人","制单时间","审核人","审核时间","审核状态","审核意见","审核结果"};
            for(Returnfactorychuku r : returnfactorychukuList){
                map = new HashMap<>();
                map.put("序号",r.getId().toString());
                map.put("返厂出库单号",r.getOutkudan());
                map.put("返厂出库状态",r.getOutkustatus());
                map.put("制单人",r.getZhidanren());
                map.put("制单时间",r.getZhidandate().toString());
                map.put("审核人",r.getApprover());
                map.put("审核时间",r.getApprovedate().toString());
                map.put("审核状态",r.getApprovestatus());
                map.put("审核意见",r.getApproveopinion());
                map.put("审核结果",r.getApproveresult());
                datas.add(map);
            }
            Workbook wb = new XSSFWorkbook();
            Sheet sheet = wb.createSheet("返厂出库信息");
            Row firstRow = sheet.createRow(0);
            for (int i=0;i<strings.length;i++){
                Cell cell = firstRow.createCell(i);
                cell.setCellValue(strings[i]);
            }
            for (int i=0;i<datas.size();i++){
                Map<String,String> rowMap = datas.get(i);
                Row row = sheet.createRow(i+1);
                for (int j=0;j<strings.length;j++){
                    Cell cell = row.createCell(j);
                    cell.setCellValue(rowMap.get(strings[j]));
                }
            }
            wb.write(out);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
