package com.sgh.service;

import com.sgh.pojo.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> queryAllCustomer();
    Customer getCustomerById(int cid);

    List<Customer>getCustomerByName(String cname);

    int deleteCustomerById(int cid);
    int insertCustomer(Customer customer);
    int updateCustomer(Customer customer);
}
