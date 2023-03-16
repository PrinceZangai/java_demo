package com.mybatis.test;

import com.mybatis.domain.Computer;
import com.mybatis.domain.Person;
import com.mybatis.domain.User;
import com.mybatis.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.List;

public class UserTest {
    private UserDao userDao=null;
    private SqlSession sqlSession=null;
    private SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void start() throws IOException {
        //1.获取指向核心配置文件的输入流对象
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3。获取SqlSession对象
        sqlSession=sqlSessionFactory.openSession();
        //4.获取UserDao的代理类对象
        userDao=sqlSession.getMapper(UserDao.class);
    }

    @After
    public void end(){
        //不加commit，更新、添加、删除操作失效
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findAll() throws Exception {

       //5.调用方法
        List<User> users=userDao.findAll();

        for (User user:users) {
            System.out.println(user);
        }
    }

    @Test
    public void add() throws Exception{
        User user=new User(3,"Oppo","123");
        userDao.add(user);
    }

    @Test
    public void update() throws Exception{
        User user=new User(3,"zhangsan","zs");
        userDao.update(user);
    }

    @Test
    public void delete() throws Exception{
        userDao.delete(3);
    }

    @Test
    public void findById(){
        //缓存
        //一级缓存是默认开启的，为sqlSession级别（sql语句会检查提交的sql语句，如果之前提交过，就直接把数据返回？）
//        User user=userDao.findById(2);
//        System.out.println(user);
//
//        //执行增删改，clearcache(),commit(),close(),flushCache=True也会清空缓存。
//        sqlSession.clearCache();
//        User user2=userDao.findById(2);
//        System.out.println(user==user2);
//        System.out.println(user.hashCode());
//        System.out.println(user2.hashCode());

        //二级缓存是SqlSessionFactory级别的
        SqlSession s1=sqlSessionFactory.openSession();
        UserDao u1=s1.getMapper(UserDao.class);
        User user1 = u1.findById(1);
        System.out.println(user1.hashCode());

        //二级缓存存在与SqlSessionFactory对象中，只有当s1关闭时，其数据才会被写入SqlSessionFactory，此时二级缓存生效，
        //二级缓存使用的是磁盘空间，所以需要对象实现序列化接口，反序列化回来时，写入内存中，所以地址值不同
        s1.close();

        SqlSession s2=sqlSessionFactory.openSession();
        UserDao u2=s2.getMapper(UserDao.class);
        User user2 = u2.findById(1);
        System.out.println(user2.hashCode());
    }

    @Test
    public void count(){
        System.out.println(userDao.count());
    }

    @Test
    public void findByName(){
        List<User> users=userDao.findByName("%o%");
        for(User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void findByPage(){
        List<User> users=userDao.findByPage(2,2);
        for(User user:users){
            System.out.println(user);
        }
    }

    @Test
    public void findByPerson(){
        User user=userDao.findByPerson(new Person(1,new User(1,"tom","123"),123));
        System.out.println(user);
    }

    @Test
    public void add2(){
        User user=new User();
        user.setUsername("BBB");
        user.setPassword("123456");
        System.out.println(user);
        userDao.add2(user);
        System.out.println(user);
    }

    @Test
    public void findByCondition(){
        User user=new User();
//        user.setId(1);
        user.setUsername("Tom");
        List<User> users=userDao.findByCondition(user);
        for(User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void findByIds(){
        List<User>  users=userDao.findByIds(new int[]{1,2,3});
        for(User u:users){
            System.out.println(u);
        }
    }

    @Test
    public void findAllWithComputer(){
        List<User> users = userDao.findAllWithComputer();
        for (User user :users) {
            System.out.println(user);
            //当不使用computer数据的时候，延迟加载不会查询computer表
//            System.out.println(user.getId()+"..."+user.getUsername()+"..."+user.getPassword());
        }
    }
}
