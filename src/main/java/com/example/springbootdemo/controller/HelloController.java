package com.example.springbootdemo.controller;

import com.example.springbootdemo.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${hello.name}")
    private String name;

    @Value("${hello.age}")
    private int age;


    @RequestMapping("/hello")
    public String hello (){
        return "hello " + name +"\t" + age ;
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User("小明", "1233432");
    }



}
