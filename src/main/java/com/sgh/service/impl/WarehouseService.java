package com.sgh.service.impl;


import com.sgh.dao.WarehouseMapper;
import com.sgh.pojo.Warehouse;
import com.sgh.service.IWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService implements IWarehouseService {
    @Autowired
    private WarehouseMapper warehouseMapper;

    @Override
    public List<Warehouse> queryAllWarehouse() {
        return warehouseMapper.queryAllWarehouse();
    }

    @Override
    public Warehouse getWarehouseById(int wid) {
        return warehouseMapper.getWarehouseById(wid);
    }

    @Override
    public List<Warehouse> getWarehouseByName(String wname) {
        return warehouseMapper.getWarehouseByName(wname);
    }

    @Override
    public int deleteWarehouseById(int wid) {
        return warehouseMapper.deleteWarehouseById(wid);
    }

    @Override
    public int insertWarehouse(Warehouse warehouse) {
        return warehouseMapper.insertWarehouse(warehouse);
    }

    @Override
    public int updateWarehouse(Warehouse warehouse) {
        return warehouseMapper.updateWarehouse(warehouse);
    }
}
