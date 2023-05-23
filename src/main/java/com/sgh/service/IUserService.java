package com.sgh.service;

import com.sgh.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> queryAllUser();
    User getUserById(int id);
    int deleteUserById(int id);
    int insertUser(User user);
    int updateUser(User user);
}
