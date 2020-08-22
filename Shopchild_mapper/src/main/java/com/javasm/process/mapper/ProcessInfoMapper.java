package com.javasm.process.mapper;

import com.javasm.process.entity.ProcessInfo;
import com.javasm.process.entity.ProcessInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessInfoMapper {


    List<ProcessInfo> queryAll();

    void insert(@Param("p") ProcessInfo processInfo);
}