package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User find(int id) {
        return userMapper.findUser(id);
    }

    @Override
    public int add(User user) {
        userMapper.addUser(user);
        return 1;
    }

    @Override
    public int update(User user) {
        userMapper.updateUser(user);
        return 1;
    }

    @Override
    public int delete(int id) {
        userMapper.deleteUser(id);
        return 1;
    }
}
