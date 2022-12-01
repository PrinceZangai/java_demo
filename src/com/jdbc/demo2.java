package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class demo2 {
    public static void main(String[] args) throws SQLException {
        Connection conn=jdbc_utils.getConnection();

//        PreparedStatement ps=conn.prepareStatement("update customer set money=money+? where username=?");
//        ps.setInt(1,100);
//        ps.setString(2,"tom");
//        ps.executeUpdate();
//
//        PreparedStatement ps2=conn.prepareStatement("update costomer set money=money+? where username=?");
//        ps2.setInt(1,-100);
//        ps2.setString(2,"jerry");
//        ps.executeUpdate();

        //开启事务
        conn.setAutoCommit(false);
        PreparedStatement ps=conn.prepareStatement("update customer set money=money+? where username=?");
        ps.setInt(1,100);
        ps.setString(2,"tom");
        ps.executeUpdate();

        ps.setInt(1,-100);
        ps.setString(2,"jerry");
        ps.executeUpdate();

        conn.commit();
//        jdbc_utils.close(conn,ps);

    }
}
