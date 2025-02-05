package com.vaibhav.beans.dbConnection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        value = "enabled",
        prefix = "postgresConnection",
        havingValue = "true",
        matchIfMissing = true)
public class PostgresConnection {

    public PostgresConnection() {
        System.out.println("PostgresConnection Init");
    }
}
