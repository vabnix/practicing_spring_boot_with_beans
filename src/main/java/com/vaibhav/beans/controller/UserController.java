package com.vaibhav.beans.controller;

import com.vaibhav.beans.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class UserController {

    @Autowired
    User user;

    public UserController() {
        System.out.println("User Controller Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User Controller Hashcode - "+ this.hashCode()
            + " User Object Hashcode -- " + user.hashCode());
    }
}
