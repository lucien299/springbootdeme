package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findUser(int id);
    void addUser(User user);
    int deleteUser(int id);
    User updateUser(User user);
}
