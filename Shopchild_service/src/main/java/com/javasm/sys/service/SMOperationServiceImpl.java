package com.javasm.sys.service;

import com.javasm.sys.entity.SMOperation;
import com.javasm.sys.mapper.SMOperationMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SMOperationServiceImpl implements SMOperationService {
    @Resource
    private SMOperationMapper smOperationMapper;

    @Override
    public List<SMOperation> selectAllOperation(SMOperation smOperation) {
        return smOperationMapper.selectAllOperation(smOperation);
    }
}
