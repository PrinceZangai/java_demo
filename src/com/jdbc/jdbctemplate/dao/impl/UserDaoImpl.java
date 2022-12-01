package com.jdbc.jdbctemplate.dao.impl;

import com.jdbc.jdbctemplate.dao.UserDao;
import com.jdbc.jdbctemplate.pojo.User;
import com.jdbc.jdbctemplate.util.DruidUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jt=new JdbcTemplate(DruidUtils.getDataSource());

    @Override
    public void add(User user) {
        jt.update("insert into user values (?,?,?)",user.getId(),user.getUsername(),user.getPassword());
    }

    @Override
    public void update(User user) {
        jt.update("update user set username=?,password=? where id=?",user.getUsername(),user.getPassword(),user.getId());
    }

    @Override
    public void delete(int id) {
        jt.update("delete from user where id=?",id);
    }

    @Override
    public List<User> findAll() {
        List<User> users=jt.query("select *from user",new BeanPropertyRowMapper<>(User.class));
        return users;
    }

    @Override
    public User find(int id) {
        User user=jt.queryForObject("select * from user where id=?",new BeanPropertyRowMapper<>(User.class),id);
        return user;
    }
}
