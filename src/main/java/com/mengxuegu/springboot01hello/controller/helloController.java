package com.mengxuegu.springboot01hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return  "12234hello";
    }
}
