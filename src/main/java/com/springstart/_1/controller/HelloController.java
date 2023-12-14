package com.springstart._1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    @GetMapping(path = "/hello")
    public String sayHello(@RequestParam(name="name", defaultValue = "world") String name){
        return "Hello " + name +"!";

    }



}
