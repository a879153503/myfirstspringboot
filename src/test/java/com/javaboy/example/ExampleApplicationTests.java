package com.javaboy.example;

import com.javaboy.example.pojo.User;
import com.javaboy.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootTest
class ExampleApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setAddress("www.javaboy.org");
        user.setUserName("javaboy");
        userService.addUser(user);
    }

    @Test
    public void test1(){
        User user = new User();
        user.setId(1);
        user.setUserName("javaboy-2");
        userService.updateUsernameById(user);
    }

    @Test
    public void test2(){
        userService.deleteUserById(1);
    }

    @Test
    public void test3(){
        List<User> users = userService.getAllUsers();

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUserName());
        }
    }

    @Test
    public void test4(){
        List<User> users = userService.getAllUsers2();

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getUserName());
        }
    }
}
