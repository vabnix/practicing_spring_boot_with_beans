package com.vaibhav.beans.dbConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Autowired
    PostgresConnection postgresConnection;

    @Autowired
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init() {
        System.out.println("DBConnection Init");
        System.out.println("PostgresConnection - "+ postgresConnection);
        System.out.println("NoSqlConnection -"+ noSqlConnection);
    }
}
