package com.sgh.service;

import com.sgh.pojo.Warehouse;

import java.util.List;

public interface IWarehouseService {
    List<Warehouse> queryAllWarehouse();

    Warehouse getWarehouseById(int wid);
    List<Warehouse>getWarehouseByName(String wname);

    int deleteWarehouseById(int wid);
    int insertWarehouse(Warehouse warehouse);
    int updateWarehouse(Warehouse warehouse);
}
