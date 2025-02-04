package com.vaibhav.beans.controller;

import com.vaibhav.beans.entity.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

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
