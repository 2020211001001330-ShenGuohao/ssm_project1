package com.sgh.controller;


import com.sgh.pojo.Customer;
import com.sgh.service.impl.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;



    //查询所有客户
    @RequestMapping("/customerList")
    public String showAllCustomer(HttpServletRequest request){

        List<Customer> customers = customerService.queryAllCustomer();
        request.setAttribute("customerList",customers);
        request.setAttribute("num",customers.size());
        return "customerList";
    }

    //根据客户名字，进行模糊查询
    @PostMapping("/queryCustomer.action")
    public String queryCustomerByName(String queryName,HttpServletRequest request){
        String Name='%'+queryName+'%';
//        System.out.println(Name);
        List<Customer> customerByName = customerService.getCustomerByName(Name);
        request.setAttribute("customerList",customerByName);
        request.setAttribute("num",customerByName.size());
        request.setAttribute("queryName",queryName);

        return "customerList";

    }


    //删除客户
    @ResponseBody
    @RequestMapping("/deleteCustomer.action")
    public int deleteCustomerById(int id){
        return customerService.deleteCustomerById(id);
    }


    //添加客户
    @PostMapping("/addCustomer.action")
    public String adduser(Customer customer){

        System.out.println(customer);
//        customerService.insertCustomer(customer);
        return "redirect:/customerList";
    }



    //返回更新之前的客户信息 使用ajax传回前端
    @ResponseBody
    @RequestMapping("/getCustomerById")
    public Customer get(int cid){
        return  customerService.getCustomerById(cid);
    }


    @PostMapping("/updateCustomerr.action")
    public String updateUser(Customer customer){
       customerService.updateCustomer(customer);
        return "redirect:/customerList";
    }


}
