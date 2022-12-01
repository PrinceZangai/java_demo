package com.jdbc.jdbctemplate.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DruidUtils {
    private static DataSource dataSource;
    static{
        try {
            Properties p=new Properties();
            p.load(DruidUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
            dataSource=DruidDataSourceFactory.createDataSource(p);
        } catch (Exception e) {
            System.out.println("数据库连接池工具类加载失败");
        }
    }
    public static DataSource getDataSource(){
        return dataSource;
    }
    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public static void close(Connection conn) throws SQLException {
        conn.close();
    }
}
