package com.javasm.process.service;

import com.javasm.process.entity.ProcessInfo;
import com.javasm.process.mapper.ProcessInfoMapper;
import com.javasm.productManager.mapper.ProductTypeInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProcessServiceImpl implements  ProcessService{
    @Resource
     ProcessInfoMapper processInfoMapper;

    @Override
    public List<ProcessInfo> queryAll() throws  Exception{
        return processInfoMapper.queryAll();
    }

    @Override
    public void insert(ProcessInfo processInfo) {
        processInfoMapper.insert(processInfo);
    }
}
