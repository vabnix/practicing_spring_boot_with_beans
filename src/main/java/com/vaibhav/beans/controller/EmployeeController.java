package com.vaibhav.beans.controller;

import com.vaibhav.beans.entity.Employee;
import com.vaibhav.beans.entity.User;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("prototype")
public class EmployeeController {

    @Autowired
    User user;

    @Autowired
    Employee employee;

    public EmployeeController() {
        System.out.println("Employee Controller Initialized");
    }

    @PostConstruct
    public void init(){
        System.out.println("Employee Controller Hashcode - "+ this.hashCode()
                + " Employee Object Hashcode -- " + employee.hashCode());
    }
}
