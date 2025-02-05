package com.vaibhav.beans.dbConnection;

import org.springframework.stereotype.Component;

@Component
public class PostgresConnection {

    public PostgresConnection() {
        System.out.println("PostgresConnection Init");
    }
}
