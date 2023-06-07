package com.sgh.dao;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WarehouseMapper {
    List<Warehouse> queryAllWarehouse();

    Warehouse getWarehouseById(int wid);
    List<Warehouse>getWarehouseByName(String wname);

    int deleteWarehouseById(int wid);
    int insertWarehouse(Warehouse warehouse);
    int updateWarehouse(Warehouse warehouse);
}
