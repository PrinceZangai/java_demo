package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class demo4 {
    public static void main(String[] args) throws Exception {

        //反射获取的方法和属性不能是私有
        //反射获取注解，注解需要设置retention为runtime
        //使用反射获取类上的注解
//        Class clazz=Class.forName("com.annotation.D");
//        MyAnno3 anno= (MyAnno3) clazz.getAnnotation(MyAnno3.class);
//        String name=anno.name();
//        int age=anno.age();
//        System.out.println(name);
//        System.out.println(name+"..."+age);

//        使用反射获取方法上的注解
//        Class clazz=Class.forName("com.annotation.D");
//        Method med=clazz.getMethod("getFood");
//        MyAnno3 anno=med.getAnnotation(MyAnno3.class);
//        String name=anno.name();
//        int age=anno.age();
//        System.out.println(name);
//        System.out.println(name+"..."+age);

        //使用反射获取属性上的注解
        Class clazz=Class.forName("com.annotation.D");
        Field field=clazz.getField("food");
        MyAnno3 anno=field.getAnnotation(MyAnno3.class);
        String name=anno.name();
        int age=anno.age();
        System.out.println(name+"..."+age);

        //思考：annotation对象是自己定义的，能否动态加载？
        //给定string anno表示注解路径字符串
//        String anno="com.annotation.MyAnno3";
//        Class clazz=Class.forName("com.annotation.D");
//        clazz.getAnnotation();
//        Field field=clazz.getField("food");
//        Class clazz2=Class.forName("com.annotation.MyAnno3");
//        Annotation anno=field.getAnnotation(clazz2);
//        System.out.println(anno);
//        Class[] inf=clazz.getInterfaces();
//        System.out.printf(String.valueOf(inf.length));
//        Object obj=inf.newInstance();
//        System.out.println(obj);

        //以下代码为反射复习
//        Object  obj=clazz.newInstance();
//        Method med=clazz.getMethod("getFood");
//        Object o=field.get(obj);
//        System.out.println(o);
//        field.set(obj,new String("shit"));
//        System.out.println(field.get(obj));
//        String food=field.toString();
//        System.out.println(food);

    }
}

@MyAnno3(age=12,name="Tom")
class D{

    @MyAnno3(name="zhangsan",age=18)
    public String food;

    @MyAnno3(name="jerry",age=15)
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
