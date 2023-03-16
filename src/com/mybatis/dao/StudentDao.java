package com.mybatis.dao;

import com.mybatis.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();

}
