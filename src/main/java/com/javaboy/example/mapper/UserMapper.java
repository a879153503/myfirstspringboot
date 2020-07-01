package com.javaboy.example.mapper;

import com.javaboy.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getAllUsers();
}
