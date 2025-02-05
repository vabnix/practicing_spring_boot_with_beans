package com.vaibhav.beans.dbConnection;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Value("${dbUrl}")
    String dbUrl;

    @Value("${port}")
    Integer port;

    @Autowired(required = false)
    PostgresConnection postgresConnection;

    @Autowired(required = false)
    NoSqlConnection noSqlConnection;

    @PostConstruct
    public void init() {
        System.out.println("DBConnection Init");
        System.out.println("PostgresConnection - "+ postgresConnection);
        System.out.println("NoSqlConnection -"+ noSqlConnection);

        System.out.println("username - "+ username + " " +
                ", password : "+ password + " " +
                ", dburl: "+ dbUrl +
                " portNumber : "+ port);
    }
}
