package com.mybatis.dao;

import com.mybatis.domain.Teacher;

import java.util.List;

public interface TeacherDao {
    public List<Teacher> findAll();
}
