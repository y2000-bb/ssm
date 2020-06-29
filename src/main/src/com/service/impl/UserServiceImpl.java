package com.service.impl;

import aopandinterface.MyFirstAnnotation;
import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @MyFirstAnnotation
    public Integer saveUser(User user) {
        int i = userDao.save(user);
        int number = 1/0;
        int i2 = userDao.save(user);
        System.out.println(i);
        return i;
    }

    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
