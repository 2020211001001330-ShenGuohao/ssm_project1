package com.sgh.controller;


import com.sgh.dao.DrugMapper;
import com.sgh.dao.OrderMapper;
import com.sgh.dao.StaffMapper;
import com.sgh.dao.WarehouseMapper;
import com.sgh.pojo.Drug;
import com.sgh.pojo.Order;
import com.sgh.pojo.Staff;
import com.sgh.pojo.Warehouse;
import com.sgh.service.impl.DrugService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MainController {


     @Autowired
     private OrderMapper orderMapper;

     @ResponseBody
     @RequestMapping("/qo")
     public int getAllOrder(Order order){
         System.out.println(order);
         return orderMapper.insertOrder(order);
     }



    @RequestMapping("/")
    public String toLogin(){
        return "index";
    }

}
