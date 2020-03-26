package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello (){
        return "hello";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User("小明", "1233432");
    }

}
