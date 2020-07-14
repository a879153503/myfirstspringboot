package com.javaboy.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描指定包下面添加@Mapper注解
//这样以后Mapper接口里不用一个个都写@Mapper了
@MapperScan("com.javaboy.example.mapper")
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }

}
