package com.reflect;

import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) throws Exception {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入类名");
//        String className=sc.next();
//        System.out.println("请输入方法名");
//        String methodName=sc.next();
//        Class clazz=Class.forName(className);
//        Object obj=clazz.newInstance();
//        Method meth=clazz.getMethod(methodName,Object.class);
//        meth.invoke(obj,)

        Properties prop=new Properties();
        prop.load(demo3.class.getResourceAsStream("name.properties"));
        String className=prop.getProperty("className");
        String methodName=prop.getProperty("methodName");
        Class clazz=Class.forName(className);
        Object obj=clazz.newInstance();
        Method meth=clazz.getMethod(methodName);
        meth.invoke(obj);
    }
}
