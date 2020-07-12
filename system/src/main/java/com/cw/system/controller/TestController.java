package com.cw.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/system")  //这种方法还是太低级了， 看配置文件context方式
public class TestController {

    @RequestMapping("/hello")
    public String test(){
        return "你好🐻第";
    }
}
