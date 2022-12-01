package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Properties;

public class demo3 {
    public static void main(String[] args) throws Exception {

        Connection conn=MyConnectionPool.getConnection();
        System.out.println(conn);
    }
}
