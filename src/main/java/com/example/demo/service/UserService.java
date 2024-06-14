package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService {
    User find(int id);
    int add(User user);
    int update(User user);
    int delete(int id);


}
