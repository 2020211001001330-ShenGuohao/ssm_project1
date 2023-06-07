package com.sgh.service.impl;

import com.sgh.dao.OrderMapper;
import com.sgh.pojo.Order;
import com.sgh.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class OrderService implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getAllOrders() {
        return orderMapper.getAllOrders();
    }

    @Override
    public List<Order> getOrderByOidAndCidAndDid(Map<String, Object> map) {
        return orderMapper.getOrderByOidAndCidAndDid(map);
    }

    @Override
    public int deleteOrder(int oid) {
        return orderMapper.deleteOrder(oid);
    }

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }
}
