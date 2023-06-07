package com.sgh.dao;

import com.sgh.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CustomerMapper {


    List<Customer> queryAllCustomer();

    Customer getCustomerById(int cid);
    List<Customer>getCustomerByName(String cname);

    int deleteCustomerById(int cid);
    int insertCustomer(Customer customer);
    int updateCustomer(Customer customer);

}
