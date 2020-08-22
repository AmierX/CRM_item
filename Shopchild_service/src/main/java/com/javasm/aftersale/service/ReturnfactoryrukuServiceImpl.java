package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Returnfactoryruku;
import com.javasm.aftersale.mapper.ReturnfactoryrukuMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReturnfactoryrukuServiceImpl implements IReturnfactoryrukuService {

    @Resource
    private ReturnfactoryrukuMapper returnfactoryrukuMapper;

    @Override
    public List<Returnfactoryruku> selectRuKu(Returnfactoryruku returnfactoryruku) {
        return returnfactoryrukuMapper.selectRuKus(returnfactoryruku);
    }

    @Override
    public boolean addRuKu(Returnfactoryruku returnfactoryruku) {
        int i = returnfactoryrukuMapper.insertSelective(returnfactoryruku);
        return i>0?true:false;
    }

    @Override
    public boolean updateRuKu(Returnfactoryruku returnfactoryruku) {
        int i = returnfactoryrukuMapper.updateByPrimaryKeySelective(returnfactoryruku);
        return i>0?true:false;
    }

    @Override
    public boolean deleteRuKu(String[] rids) {
        int i = returnfactoryrukuMapper.deleteRuKu(rids);
        return i>0?true:false;
    }
}
