package com.javasm.aftersale.service;

import com.javasm.aftersale.entity.Salesreturn;

import java.util.List;

public interface ISalesreturnService {

    List<Salesreturn> selectTuiHuo(Salesreturn salesreturn);

    boolean addTuiHuo(Salesreturn salesreturn);

    boolean updateTuiHuo(Salesreturn salesreturn);

    boolean deleteTuiHuo(String[] tids);
}
