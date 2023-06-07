package com.sgh.service;

import com.sgh.pojo.Order;

import java.util.List;
import java.util.Map;

public interface IOrderService {
    List<Order> getAllOrders();
    List<Order> getOrderByOidAndCidAndDid(Map<String,Object> map);

    int deleteOrder(int oid);
    int insertOrder(Order order);
}
