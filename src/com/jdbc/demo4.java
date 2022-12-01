package com.jdbc;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.mchange.v2.c3p0.DataSources;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class demo4 {
    public static void main(String[] args) throws Exception {


        Class.forName("com.mysql.cj.jdbc.Driver");
        DataSource unpooled = DataSources.unpooledDataSource("jdbc:mysql://localhost:3306/db6", "root", "123321");
        DataSource pooled = DataSources.pooledDataSource( unpooled );
        Connection conn=pooled.getConnection();
        conn.close();
//        DataSource dataSource=new ComboPooledDataSource();
//        Connection conn=dataSource.getConnection("root","123321");
        System.out.println(conn);


    }
}
