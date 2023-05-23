package com.sgh.dao;

import com.sgh.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User>queryAllUser();
    User getUserById(int id);
    int deleteUserById(int id);
    int insertUser(User user);
    int updateUser(User user);

}
