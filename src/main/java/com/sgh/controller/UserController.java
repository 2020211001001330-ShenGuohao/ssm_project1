package com.sgh.controller;


import com.sgh.pojo.User;

import com.sgh.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("/userList")
    public String hello(HttpServletRequest request){

        List<User> users = userService.queryAllUser();
        request.setAttribute("userList",users);

        return "/user/userList";
    }

    @ResponseBody
    @RequestMapping("/getUserById")
    public User get(int id){

        return userService.getUserById(id);
    }

    @ResponseBody
    @RequestMapping("/deleteUser.action")
    public int deleteUserById(int id){
        return userService.deleteUserById(id);
    }


    @RequestMapping("/toUpdate")
    public String toUpdate(int id,HttpServletRequest request){

        User userById = userService.getUserById(id);
        request.setAttribute("User",userById);
        return "/user/update";
    }


    @RequestMapping("/updateUser.action")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/userList";
    }

    @PostMapping("/addUser.action")
    public String adduser(User user){
//        System.out.println(user+"====>look here");
        userService.insertUser(user);
        return "redirect:/userList";
    }




}