package com.javaboy.example.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

//    @Bean
//    //类型安全的属性注入
//    @ConfigurationProperties(prefix = "spring.datasource.one")
//    public DataSource dsOne(){
//
//        return DruidDataSourceBuilder.create().build();
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.two")
//    public DataSource dsTwo(){
//
//        return DruidDataSourceBuilder.create().build();
//    }
}
