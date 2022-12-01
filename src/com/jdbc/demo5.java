package com.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class demo5 {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        p.load(demo5.class.getResourceAsStream("jdbc.properties"));
//        DataSource dataSource= DruidDataSourceFactory.createDataSource(p);
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/db6");
        dataSource.setUsername("root");
        dataSource.setPassword("123321");
        JdbcTemplate jt=new JdbcTemplate(dataSource);
//
//        int i=jt.update("insert into user values(null,?,?)","tom","123");
//        System.out.println(i);
        List<User> li=jt.query("select * from user",new BeanPropertyRowMapper<User>(User.class));
        for (User user:li) {
            System.out.println(user);
        }

        List<User> li2=jt.query("select * from user where id in (?,?)",new BeanPropertyRowMapper<User>(User.class),1,2);
        for (User user:li2) {
            System.out.println(user);
        }

        User user=jt.queryForObject("select * from user where id=?",new BeanPropertyRowMapper<>(User.class),1);
        System.out.println(user);

        String username=jt.queryForObject("select username from user where id=?",String.class,1);
        System.out.println(username);

    }
}

