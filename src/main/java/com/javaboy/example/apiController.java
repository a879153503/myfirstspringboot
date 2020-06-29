package com.javaboy.example;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api")
public class apiController {

    @ResponseBody
    @PostMapping("/getInfo")
    public String getInfo(){
        Map resultMap = new HashMap();
        resultMap.put("name","张三");
        resultMap.put("id","cd1933067");
        resultMap.put("age","19");
        resultMap.put("sex","男");
        String result = JSON.toJSONString(resultMap);
        return result;
    }
}
