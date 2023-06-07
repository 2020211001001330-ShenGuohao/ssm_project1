package com.sgh.controller;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Warehouse;
import com.sgh.service.impl.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;


    //查询所有仓库信息
    @RequestMapping("/warehouseList")
    public String showAllWarehouse(HttpServletRequest request){

        List<Warehouse> warehouses = warehouseService.queryAllWarehouse();
        request.setAttribute("warehouseList",warehouses);
        request.setAttribute("num",warehouses.size());
        return "warehouseList";
    }

    //根据仓库名字，进行模糊查询
    @PostMapping("/queryWarehouse.action")
    public String queryWarehouseByName(String queryName,HttpServletRequest request){
        String Name='%'+queryName+'%';
//        System.out.println(Name);
        List<Warehouse> warehouseByName = warehouseService.getWarehouseByName(Name);

        request.setAttribute("warehouseList",warehouseByName);
        request.setAttribute("num",warehouseByName.size());
        request.setAttribute("queryName",queryName);
        return "warehouseList";

    }


    //删除仓库
    @ResponseBody
    @RequestMapping("/deleteWarehouse.action")
    public int deleteWarehouseById(int wid){
        return warehouseService.deleteWarehouseById(wid);
    }

    //添加仓库信息
    @PostMapping("/addWarehouse.action")
    public String addWarehouse(Warehouse warehouse){

        warehouseService.insertWarehouse(warehouse);
        return "redirect:/warehouseList";
    }


    //返回更新之前的客户信息 使用ajax传回前端
    @ResponseBody
    @RequestMapping("/getWarehouseById")
    public Warehouse get(int wid){
        return  warehouseService.getWarehouseById(wid);
    }

    @PostMapping("/updateWarehouse.action")
    public String updateWarehouse(Warehouse warehouse){
        warehouseService.updateWarehouse(warehouse);
        return "redirect:/warehouseList";
    }



}
