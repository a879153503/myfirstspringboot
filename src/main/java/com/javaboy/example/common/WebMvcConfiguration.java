package com.javaboy.example.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * 继承WebMvcConfigurationSupport接口
 * 重写接口拦截器
 */
@Configuration
public class WebMvcConfiguration extends WebMvcConfigurationSupport {

    private static final String[] excludePathPatterns = {"/api/token/api_token"};

    //自定义的接口拦截器
    @Autowired
    private TokenInterceptor tokenInterceptor;

    //添加一个自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        //添加拦截器
        registry.addInterceptor(tokenInterceptor)
                //添加拦截路径
                .addPathPatterns("/api/**")
                //排除指定路径的拦截
                .excludePathPatterns(excludePathPatterns);
    }
}
