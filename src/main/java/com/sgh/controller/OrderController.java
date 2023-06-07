package com.sgh.controller;


import com.sgh.pojo.Customer;
import com.sgh.pojo.Drug;
import com.sgh.pojo.Order;
import com.sgh.service.impl.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {


    @Autowired
    private OrderService orderService;


    //查询所有订单
    @RequestMapping("/orderList")
    public String showAllOrder(HttpServletRequest request){

        List<Order> allOrders = orderService.getAllOrders();
        request.setAttribute("orderList",allOrders);
        request.setAttribute("num",allOrders.size());
        return "orderList";
    }

    //根据客户名字，进行模糊查询
    @PostMapping("/queryOrder.action")
    public String queryOrderByOidAndCidAndDid(String queryName1,String queryName2,String queryName3,HttpServletRequest request){
        String oid=queryName1;         //订单编号
        String cid=queryName2;                //客户编号
        String did=queryName3;                  //药品编号

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oid",'%'+oid+'%');
        map.put("cid",cid);
        map.put("did",did);

        System.out.println(map);

//        System.out.println(map);
        if(map.get("cid")==""){
            map.put("cid",null);
        }
        if(map.get("did")==""){
            map.put("did",null);
        }
        System.out.println(map);

        List<Order> orderByOidAndCidAndDid = orderService.getOrderByOidAndCidAndDid(map);

        request.setAttribute("orderList",orderByOidAndCidAndDid);

        request.setAttribute("num",orderByOidAndCidAndDid.size());
        request.setAttribute("queryName1",queryName1);
        request.setAttribute("queryName2",queryName2);
        request.setAttribute("queryName3",queryName3);

        return "orderList";

    }


    //删除订单
    @ResponseBody
    @RequestMapping("/deleteOrder.action")
    public int deleteOrderById(int oid){
        return orderService.deleteOrder(oid);
    }


    //添加订单
    @PostMapping("/addOrder.action")
    public String addOrder(Order order){
          order.setODate(new Date());
        orderService.insertOrder(order);

        return "redirect:/orderList";
    }

}
