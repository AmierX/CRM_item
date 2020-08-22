package com.javasm.sys.service;

import com.javasm.sys.entity.SMPerToReport;

import java.util.List;

public interface SMPerToReportService {
    List<SMPerToReport> selectAllPerToReport(SMPerToReport smPerToReport);

    void exportExcel(SMPerToReport smPerToReport);

}
