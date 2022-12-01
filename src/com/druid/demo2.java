package com.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.sql.Connection;
import java.sql.SQLException;

public class demo2 {
    public static void main(String[] args) throws SQLException {
        DruidDataSource dataSource=new DruidDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db6");
        dataSource.setUsername("root");
        dataSource.setPassword("123321");
        Connection conn=dataSource.getConnection();
        System.out.println(conn);
    }
}
