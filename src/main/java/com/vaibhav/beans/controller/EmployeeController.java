package com.vaibhav.beans.controller;

import com.vaibhav.beans.entity.Employee;
import com.vaibhav.beans.entity.User;
import jakarta.annotation.PostConstruct;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
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

    @GetMapping("/employee")
    public ResponseEntity<String> fetchEmployee(HttpServletRequest request){
        System.out.println("Fetching the API Request called");
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

    @GetMapping("/employee/logout")
    public ResponseEntity<String> logoutEmployee(HttpServletRequest request){
        System.out.println("User is logged out");
        request.getSession().invalidate();
        return ResponseEntity.status(HttpStatus.OK).body("OK");
    }

}
