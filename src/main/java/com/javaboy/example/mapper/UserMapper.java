package com.javaboy.example.mapper;

import com.javaboy.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

//@Mapper
@Component
public interface UserMapper {

    List<User> getAllUsers();
}
