package com.jdbc;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import java.util.Properties;

//理解类加载器的作用：假设外部数据传进来一个字符串“package.A”，代表某个包下的类名，静态加载当然可以import，但是动态的情况下不能修改源代码
//此时可以考虑使用Class来动态加载类，比如这里，当然可以考虑直接import mysql.Driver,但是如果换一个数据库，比如Orcle呢？所以必须动态加载类。
public class jdbc_utils {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    static {
        try {
            Properties p=new Properties();
            p.load(jdbc_utils.class.getResourceAsStream("jdbc.properties"));
            driver=p.getProperty("driver");
            url=p.getProperty("url");
            username=p.getProperty("username");
            password=p.getProperty("password");

            Class.forName(driver);
        } catch (Exception e) {
            System.out.println("初始化失败");
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection conn= DriverManager.getConnection(url,username,password);
        return conn;
    }
    public static void close(Connection conn,PreparedStatement ps) throws SQLException {
        close(conn,ps,null);
    }
    public static void close(Connection conn,PreparedStatement ps,ResultSet rs) throws SQLException {
        rs.close();
        ps.close();
        conn.close();
    }

//    public static void main(String[] args) throws SQLException {
//        Connection conn=jdbc_utils.getConnection();
//
//    }
}
