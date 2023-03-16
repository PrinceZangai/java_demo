package com.reflect;

//类的加载与初始化
public class demo5 {
    static {
        System.out.println("demo5初始化");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        Son s=new Son();
//        demo5初始化--父类被加载---子类被加载---子类无参构造方法

//        Class c1 = Class.forName("com.reflect.Son");
//        demo5初始化---父类被加载 ---子类被加载

        System.out.println(Son.M);
//        demo5初始化 ---10
        //被static+final修饰的常量加载时就放进了常量池，调用常量不发生类的初始化
//      类的加载分为三个阶段：加载-链接-初始化，
    }
}

class Father{
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
    }
    static final int M=10;
    static int m=100;
    public Son(){
        System.out.println("子类无参构造方法");
        m=300;
    }


}