package com.sgh.service.impl;

import com.sgh.dao.UserMapper;
import com.sgh.pojo.User;
import com.sgh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
