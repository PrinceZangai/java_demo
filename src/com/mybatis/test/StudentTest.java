package com.mybatis.test;

import com.mybatis.dao.StudentDao;
import com.mybatis.domain.Student;
import com.mybatis.util.DaoTestUtil;
import org.junit.Test;

import java.util.List;

public class StudentTest {

    @Test
    public void findAll() throws Exception {
        StudentDao studentDao= (StudentDao)DaoTestUtil.getDaoInstance("com.mybatis.dao.StudentDao");
        List<Student> students = studentDao.findAll();
        for (Student stu:
             students) {
            System.out.println(stu);
        }
    }
}
