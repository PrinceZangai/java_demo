package com.mybatis.dao;

import com.mybatis.domain.Computer;

import java.util.List;

public interface ComputerDao {
    public List<Computer> findAll();

    public List<Computer> findByUid(int uid);
}
