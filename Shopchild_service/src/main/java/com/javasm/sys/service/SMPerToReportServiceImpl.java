package com.javasm.sys.service;

import com.javasm.sys.entity.SMPerToReport;
import com.javasm.sys.mapper.SMPerToReportMapper;
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
public class SMPerToReportServiceImpl implements SMPerToReportService {
    @Resource
    private SMPerToReportMapper smPerToReportMapper;

    @Override
    public List<SMPerToReport> selectAllPerToReport(SMPerToReport smPerToReport) {
        return smPerToReportMapper.selectAllPerToReport(smPerToReport);
    }

    @Override
    public void exportExcel(SMPerToReport smPerToReport) {
        try {
            SMPerToReport b = new SMPerToReport();
            List<Map<String, String>> datas = new ArrayList<>();
            OutputStream out = new FileOutputStream("E:/testExcel/perToReport.xlsx");
            Map<String, String> map;
            List<SMPerToReport> smPerToReports = smPerToReportMapper.selectAllPerToReport(smPerToReport);
            String[] headers = new String[]{"序号", "用户登录名", "用户姓名", "归属部门", "用户状态", "用户职务", "权限名称", "可执行操作"};
            for (SMPerToReport perToReport : smPerToReports) {
                map = new HashMap<>();
                map.put("序号", perToReport.getPid().toString());
                map.put("用户登录名", perToReport.getPacc());
                map.put("用户姓名", perToReport.getPname());
                map.put("归属部门", perToReport.getPdept());
                map.put("用户状态", perToReport.getPstatus());
                map.put("用户职务", perToReport.getPpost());
                map.put("权限名称", perToReport.getPaname());
                map.put("可执行操作", perToReport.getPoperation());
                datas.add(map);
            }
            Workbook wb = new XSSFWorkbook();//xlsx后缀
            //加数据
            Sheet sheet = wb.createSheet("权限报表");
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
}
