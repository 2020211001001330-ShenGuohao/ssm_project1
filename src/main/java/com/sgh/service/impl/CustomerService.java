package com.sgh.service.impl;


import com.sgh.dao.CustomerMapper;
import com.sgh.pojo.Customer;
import com.sgh.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> queryAllCustomer() {
        return customerMapper.queryAllCustomer();
    }

    @Override
    public Customer getCustomerById(int cid) {
        return customerMapper.getCustomerById(cid);
    }

    @Override
    public List<Customer> getCustomerByName(String cname) {
        return customerMapper.getCustomerByName(cname);
    }

    @Override
    public int deleteCustomerById(int cid) {
        return customerMapper.deleteCustomerById(cid);
    }

    @Override
    public int insertCustomer(Customer customer) {
        return customerMapper.insertCustomer(customer);
    }

    @Override
    public int updateCustomer(Customer customer) {
        return customerMapper.updateCustomer(customer);
    }
}
