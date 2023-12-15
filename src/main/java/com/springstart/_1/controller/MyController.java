package com.springstart._1.controller;
import com.springstart._1.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api")
public class MyController {



    @PostMapping(path="users")
    public List<User> saveAllUser(@RequestBody List<User> users) {
        System.out.println("Users Saved");
        return users;
    }




}
