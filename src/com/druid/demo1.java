package com.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;


public class demo1 {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
//        System.out.println(demo1.class.getResource(""));
        p.load(demo1.class.getResourceAsStream("druid.properties"));
        DataSource dataSource= DruidDataSourceFactory.createDataSource(p);
        Connection conn=dataSource.getConnection();
        System.out.println(conn);


        conn.close();

    }
}
