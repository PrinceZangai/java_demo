package com.mybatis.dao;

import com.mybatis.domain.Person;
import com.mybatis.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao{
    public List<User> findAll();
    public void add(User user);
    public void update(User user);
    public void delete(int id);
    public User findById(int id);
    public List<User> findByName(String name);
    public int count();

    public List<User> findByPage(Map<String,Integer> map);
    public List<User> findByPage(@Param("index")int index,@Param("page")int page);

    public User findByPerson(Person p);

    //插入后获取新插入的id值
    public void add2(User user);

    //根据条件查询数据
    public List<User> findByCondition(User user);

    public List<User> findByIds(int[] ids);

    //一对多查询：主表查询一个，附表查询多个，两种实现方式
    public List<User> findAllWithComputer();
}