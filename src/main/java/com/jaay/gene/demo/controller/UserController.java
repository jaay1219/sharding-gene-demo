package com.jaay.gene.demo.controller;

import com.jaay.gene.demo.pojo.User;
import com.jaay.gene.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){

        userService.addUser(user);

        return HttpStatus.OK.toString();
    }

}
