package com.mybatis.util;

import com.mybatis.dao.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DaoTestUtil {
    public static Object getDaoInstance(String daoName) throws Exception {

        Class clazz=Class.forName(daoName);
        //1.获取指向核心配置文件的输入流对象
        InputStream is= Resources.getResourceAsStream("sqlMapConfig.xml");
        //2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        //3。获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.获取UserDao的代理类对象
        Object obj=sqlSession.getMapper(clazz);
        return obj;
    }
    public static void close(SqlSession sqlSession){
        sqlSession.commit();
        sqlSession.close();
    }
}
