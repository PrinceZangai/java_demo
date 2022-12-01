package com.mybatis.test;

import com.mybatis.domain.User;
import com.mybatis.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserTest {
    @Test
    public void findAll() throws Exception {
        //1.获取指向核心配置文件的输入流对象
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3。获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.获取UserDao的代理类对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);
       //5.调用方法
        List<User> users=userDao.findAll();

        for (User user:users) {
            System.out.println(user);
        }
    }

    @Test
    public void add() throws Exception{
        User user=new User(3,"Jerry","123");
        //1.获取指向核心配置文件的输入流对象
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3。获取SqlSession对象
        SqlSession sqlSession=sqlSessionFactory.openSession();
        //4.获取UserDao的代理类对象
        UserDao userDao=sqlSession.getMapper(UserDao.class);

        userDao.add(user);
        sqlSession.commit();
        sqlSession.close();
    }
}
