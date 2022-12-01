package com.jdbc.jdbctemplate.dao;

import com.jdbc.jdbctemplate.pojo.User;

import java.util.List;

public interface UserDao {
    public void add(User user);
    public void update(User user);
    public void delete(int id);
    public List<User> findAll();
    public User find(int id);
}
