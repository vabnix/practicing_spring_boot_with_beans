package com.vaibhav.beans.dbConnection;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        value = "enabled",
        prefix = "noSqlConnection",
        havingValue = "true",
        matchIfMissing = false)
public class NoSqlConnection {

    public NoSqlConnection() {
        System.out.println("NoSqlConnection Init");
    }
}
