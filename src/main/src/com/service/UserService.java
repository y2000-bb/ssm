package com.service;

import com.entity.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    Integer saveUser(User user);
}
