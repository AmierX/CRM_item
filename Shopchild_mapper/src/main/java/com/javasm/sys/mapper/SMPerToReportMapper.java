package com.javasm.sys.mapper;

import com.javasm.sys.entity.SMPerToReport;

import java.util.List;

public interface SMPerToReportMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(SMPerToReport record);

    int insertSelective(SMPerToReport record);

    SMPerToReport selectByPrimaryKey(Integer pid);
    List<SMPerToReport> selectAllPerToReport(SMPerToReport smPerToReport);

    int updateByPrimaryKeySelective(SMPerToReport record);

    int updateByPrimaryKey(SMPerToReport record);
}