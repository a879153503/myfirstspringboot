package com.javaboy.example;

import com.javaboy.example.mapper.UserMapper;
import com.javaboy.example.pojo.User;
import com.javaboy.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ExampleApplicationTests {

//    @Autowired
//    UserService userService;
//
//    @Autowired
//    @Qualifier("jdbcTemplateOne")
//    JdbcTemplate jdbcTemplateOne;
//
//    @Resource(name = "jdbcTemplateTwo")
//    JdbcTemplate jdbcTemplateTwo;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
//        User user = new User();
//        user.setAddress("www.javaboy.org");
//        user.setUserName("javaboy");
//        userService.addUser(user);
    }

    @Test
    public void test1(){
//        User user = new User();
//        user.setId(1);
//        user.setUserName("javaboy-2");
//        userService.updateUsernameById(user);
    }

    @Test
    public void test2(){
//        userService.deleteUserById(1);
    }

    @Test
    public void test3(){
//        List<User> users = userService.getAllUsers();
//
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getUserName());
//        }
    }

    @Test
    public void test4(){
//        List<User> users = userService.getAllUsers2();
//
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getUserName());
//        }
    }

    @Test
    public void test5(){
//        List<User> users1 = jdbcTemplateOne.query("select * from user",new BeanPropertyRowMapper<>(User.class));
//        List<User> users2 = jdbcTemplateTwo.query("select * from user",new BeanPropertyRowMapper<>(User.class));
//        System.out.println(">>>>>>>>"+users1);
//        System.out.println(">>>>>>>>"+users2);
    }

    @Test
    public void test6(){
        List<User> users = userMapper.getAllUsers();
        System.out.println(users);
    }
}
