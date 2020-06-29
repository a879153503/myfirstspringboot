package com.javaboy.example;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class apiController {


    @GetMapping("/getInfo")
    public String getInfo(){

        Map resultMap = new HashMap();
        resultMap.put("name","张三");
        resultMap.put("id","cd1933067");
        resultMap.put("age","19");
        resultMap.put("sex","男");

        return JSON.toJSONString(resultMap);
    }
}
