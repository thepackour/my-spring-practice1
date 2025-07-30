package com.tpopractice.myspringpractice.controller;

import com.tpopractice.myspringpractice.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService) { this.userService = userService; }

    @PostMapping("/1karuga")
    public void karuga() {


    }

}
