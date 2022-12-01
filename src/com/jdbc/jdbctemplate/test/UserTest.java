package com.jdbc.jdbctemplate.test;

import com.jdbc.jdbctemplate.dao.UserDao;
import com.jdbc.jdbctemplate.dao.impl.UserDaoImpl;
import com.jdbc.jdbctemplate.pojo.User;
import org.junit.Test;

import java.util.List;

public class UserTest {
    private UserDao userDao=new UserDaoImpl();

    @Test
    public void add(){
        User user=new User(2,"Tom","123");
        userDao.add(user);
    }

    @Test
    public void update(){
        User user=new User(1,"jerry","123");
        userDao.update(user);
    }

    @Test
    public void delete(){
        int id=2;
        userDao.delete(id);
    }

    @Test
    public void findAll(){
        List<User>  users=userDao.findAll();
        System.out.println(users);
    }

    @Test
    public void find(){
        User user=userDao.find(2);
        System.out.println(user);
    }
}
