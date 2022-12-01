package com.reflect;

//import java.util.ArrayList;

import java.lang.reflect.Method;

public class demo2 {
    public static void main(String[] args) throws Exception{
        Class clazz=Class.forName("java.util.ArrayList");
        Object obj=clazz.newInstance();
        Method addMethod=clazz.getMethod("add",Object.class);
        addMethod.invoke(obj,"tome");
        addMethod.invoke(obj,"jerry");
        addMethod.invoke(obj,"shit");
        addMethod.invoke(obj,111);
        addMethod.invoke(obj,222);
        addMethod.invoke(obj,333);
        System.out.println(obj);
    }
}
