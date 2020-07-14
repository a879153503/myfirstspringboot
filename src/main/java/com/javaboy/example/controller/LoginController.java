package com.javaboy.example.controller;

import com.javaboy.example.mapper.UserMapper;
import com.javaboy.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserMapper userMapper;
    @GetMapping("getAll")
    @ResponseBody
    public Object getAllUsers(){
        List<User> ls = userMapper.getAllUsers();
        return ls;
    }
}
