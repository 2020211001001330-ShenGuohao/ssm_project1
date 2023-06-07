package com.sgh.service;

import com.sgh.pojo.Drug;

import java.util.List;
import java.util.Map;

public interface IDrugService {
    List<Drug> queryAllDrug();

    Drug getDrugById(int did);
    List<Drug>getDrugByNameAndWid(Map<String,Object> map);

    int deleteDrugById(int did);
    int insertDrug(Drug drug);
    int updateDrug(Drug drug);
}
