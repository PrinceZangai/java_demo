package com.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;

public class MyConnectionPool {
    private static LinkedList<Connection> pool=new LinkedList<>();

    static {
        for(int i=0;i<5;i++){
            try {
                Connection conn=jdbc_utils.getConnection();
                pool.add(conn);
            } catch (Exception e) {
                System.out.println("数据库连接池加载失败");
            }
        }
    }

    public static synchronized Connection getConnection(){
        return pool.removeFirst();
    }

    public static void close(Connection conn){
        pool.addLast(conn);
    }

}
