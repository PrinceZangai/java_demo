package com.reflect;

import java.lang.reflect.Field;

public class demo6 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器"+systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println("系统类加载器的父类，扩展类加载器："+parent);

        parent = parent.getParent();
        System.out.println("扩展类加载器父类，根加载器："+parent);

        Class<?> c1 = Class.forName("com.reflect.demo6");
        ClassLoader classLoader = c1.getClassLoader();
        System.out.println("自定义类的加载器："+classLoader);

        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println("Object类的加载器："+classLoader);


    }
}
