package com.sgh.dao;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Drug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DrugMapper {

    List<Drug> queryAllDrug();

    Drug getDrugById(int did);

    List<Drug>getDrugByNameAndWid(Map<String,Object> map);

    int deleteDrugById(int did);
    int insertDrug(Drug drug);
    int updateDrug(Drug drug);

}
