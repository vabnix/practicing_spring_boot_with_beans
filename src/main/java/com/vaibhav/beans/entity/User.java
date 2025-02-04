package com.vaibhav.beans.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class User {

    public User() {
        System.out.println("User Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("User Object Hashcode - "+ this.hashCode());
    }
}
