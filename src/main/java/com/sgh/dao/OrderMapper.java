package com.sgh.dao;

import com.sgh.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface OrderMapper {


    List<Order> getAllOrders();
    List<Order> getOrderByOidAndCidAndDid(Map<String,Object> map);

    int deleteOrder(int oid);
    int insertOrder(Order order);
}
