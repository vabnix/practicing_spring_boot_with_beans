package com.vaibhav.beans.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    User user;

    public Employee() {
        System.out.println("Employee Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Employee Object Hashcode - "+ this.hashCode());
    }
}
