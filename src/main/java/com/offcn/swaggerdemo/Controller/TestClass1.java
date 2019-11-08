package com.offcn.swaggerdemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@RestController
public class TestClass1 {
    @RequestMapping("/test")
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<>();
        map.put("1","第一");
        map.put("2","第二");
        return map;
        //{"1":"第一","2":"第二"}浏览器输出的内容（这个并没有数据回填只是简单的json数据的输出，所以不需要页面直接返回数据——map即可）
    }

}
