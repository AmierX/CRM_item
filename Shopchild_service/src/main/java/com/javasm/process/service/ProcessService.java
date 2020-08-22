package com.javasm.process.service;

import com.javasm.process.entity.ProcessInfo;

import java.util.List;

public interface ProcessService {

    List<ProcessInfo> queryAll() throws Exception;

    void insert(ProcessInfo processInfo);
}
