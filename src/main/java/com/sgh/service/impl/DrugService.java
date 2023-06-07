package com.sgh.service.impl;

import com.sgh.dao.DrugMapper;
import com.sgh.pojo.Drug;
import com.sgh.service.IDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DrugService implements IDrugService {

    @Autowired
    private DrugMapper drugMapper;

    @Override
    public List<Drug> queryAllDrug() {
        return drugMapper.queryAllDrug();
    }

    @Override
    public Drug getDrugById(int did) {
        return drugMapper.getDrugById(did);
    }

    @Override
    public List<Drug> getDrugByNameAndWid(Map<String, Object> map) {
        return drugMapper.getDrugByNameAndWid(map);
    }

    @Override
    public int deleteDrugById(int did) {
        return drugMapper.deleteDrugById(did);
    }

    @Override
    public int insertDrug(Drug drug) {
        return drugMapper.insertDrug(drug);
    }

    @Override
    public int updateDrug(Drug drug) {
        return drugMapper.updateDrug(drug);
    }
}
