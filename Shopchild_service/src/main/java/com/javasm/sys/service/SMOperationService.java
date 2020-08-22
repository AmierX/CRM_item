package com.javasm.sys.service;

import com.javasm.sys.entity.SMOperation;

import java.util.List;

public interface SMOperationService {
    List<SMOperation> selectAllOperation(SMOperation smOperation);
}
