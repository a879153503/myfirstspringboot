package com.javaboy.example.service;

import com.javaboy.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {

//    @Autowired
//    @Qualifier("jdbcTemplateOne")
//    JdbcTemplate jdbcTemplate;
//
//    public Integer addUser(User user){
//
//        return jdbcTemplate.update("insert into user (username,address) values (?,?);",user.getUserName(),user.getAddress());
//    }
//
//    public Integer updateUsernameById(User user){
//
//        return jdbcTemplate.update("update user set username = ? where id = ?;",user.getUserName(),user.getId());
//    }
//
//    public Integer deleteUserById(Integer id){
//        return jdbcTemplate.update("delete from user where id = ?",id);
//    }
//
//    public List<User> getAllUsers(){
//
//        return jdbcTemplate.query("select * from user", new RowMapper<User>() {
//
//            @Override
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                User user = new User();
//                int id = resultSet.getInt("id");
//                String username = resultSet.getString("username");
//                String address = resultSet.getString("address");
//                user.setUserName(username);
//                user.setId(id);
//                user.setAddress(address);
//                return user;
//            }
//        });
//    }
//    public List<User> getAllUsers2(){
//
//        return jdbcTemplate.query("select * from user", new BeanPropertyRowMapper<>(User.class));
//    }
}
