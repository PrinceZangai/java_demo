package com.jdbc;
import java.sql.*;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Scanner s=new Scanner(System.in);
//        System.out.println("请输入账号");
//        String username=s.next();
//        System.out.println("请输入密码");
//        String password=s.next();

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/db6","root","123321");

//        PreparedStatement ps=conn.prepareStatement("select * from user where username=? and password=?");
//        ps.setString(1,username);
//        ps.setString(2,password);
//        ResultSet rs=ps.executeQuery();
//        if(rs.next()){
//            System.out.println("登录成功");
//        }
//        else{
//            System.out.println("登录失败");
//        }
//        PreparedStatement ps=conn.prepareStatement("insert into user values(?,?,?)");
//        ps.setInt(1,4);
//        ps.setString(2,"zxj");
//        ps.setString(3,"321");
//        int i=ps.executeUpdate();
//        System.out.println(i);
//
//        PreparedStatement ps=conn.prepareStatement("update user set password= ? where id =?");
//        ps.setString(1,"zxj");
//        ps.setInt(2,4);
//        int i=ps.executeUpdate();
//        System.out.println(i);

        PreparedStatement ps=conn.prepareStatement("delete from user where username=?");
        ps.setString(1,"zxj");
        int i=ps.executeUpdate();
        System.out.println(i);

        ps.close();
        conn.close();
    }
}
