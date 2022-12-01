package com.mybatis.dao;

import com.mybatis.domain.User;

import java.util.List;

public interface UserDao{
    public List<User> findAll();
    public void add(User user);
}