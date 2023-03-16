package com.mybatis.test;

import com.mybatis.dao.UserDao;
import com.mybatis.dao.WifeDao;
import com.mybatis.domain.Wife;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class WifeTest {
    private WifeDao wifeDao=null;
    private SqlSession sqlSession=null;

    @Before
    public void start() throws IOException {
        //1.获取指向核心配置文件的输入流对象
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3。获取SqlSession对象
        sqlSession=sqlSessionFactory.openSession();
        //4.获取UserDao的代理类对象
        wifeDao=sqlSession.getMapper(WifeDao.class);
    }

    @After
    public void end(){
        //不加commit，更新、添加、删除操作失效
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void findById(){
        Wife wife=wifeDao.findById(2);
        System.out.println(wife);
    }
}
