package com.thread;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class demo2 {
    public static void main(String[] args) {
        Singleton s1=Singleton.getInstance();
        Singleton s2=Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);

    }
}
//单例设计模式
//方式一：
//饿汉式实现，优点：方便，缺点：类加载就执行，程序结束才释放，比较占内存
//class Singleton {
//    private static Singleton singleton=new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance(){
//        return singleton;
//    }
//}
//方式二：
//懒汉式实现:优点：调用时才进内存，缺点：线程不安全
//class Singleton{
//    private static final Singleton singleton=null;
//    private Singleton(){}
//    public static Singleton getInstance(){
//            if(singleton==null){
//                    Singleton singleton=new Singleton();
//                    }
////
//        return singleton;
//    }
//}

//方式三：
//优点：线程安全，缺点：无法多线程访问，效率低
//class Singleton{
//    private static final Singleton singleton=null;
//    private Singleton(){}
//    public synchronized Singleton getInstance(){
//        if (singleton==null){
//            Singleton singleton=new Singleton();
//        }
//        return singleton;
//    }
//}
//方式四,比方式三好一点，但每次都要判断锁状态，效率低
//class Singleton{
//    private static final Singleton singleton=null;
//    private Singleton(){}
//    public Singleton getInstance(){
//        synchronized (Singleton.class){
//            if (singleton==null){
//                Singleton singleton=new Singleton();
//            }
//        }
//        return singleton;
//    }
//}
//方式五，终极方式
class Singleton{
    private static final Singleton singleton=null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    Singleton singleton=new Singleton();
                }
            }
        }
        return singleton;
    }
}
