package com.controller;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/bb/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/all")
    public ModelAndView queryAll(){
        List<User> list = userService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping("/save")
    public void save(){
        User user = new User();
        user.setName("张三3");
        user.setAge(200);
        user.setId(10);
        user.setSex("3");
        Integer i = userService.saveUser(user);


    }
}
