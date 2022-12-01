package com.thread;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.security.mscapi.CPublicKey;

public class demo1 {
    public static void main(String[] args) {
        Print p=new Print();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    p.print1();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    p.print2();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    p.print3();
                }
            }
        }).start();
    }
}
//class Print{
////    private Object obj=new Object();
//    private int i =1;
//
//    public synchronized void print1(){
//            while(i!=1){
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.print(Thread.currentThread().getName()+":");
//            System.out.print("Hello");
//            System.out.println("World");
//            this.notifyAll();
//            i=2;
//    }
//    public synchronized void print2() {
//            while (i!=2) {
//                try {
//                    this.wait();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.print(Thread.currentThread().getName()+":");
//            System.out.print("Poly");
//            System.out.println("Thread");
//            this.notifyAll();
//            i=3;
//    }
//    public synchronized void print3(){
//        while (i!=3) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.print(Thread.currentThread().getName()+":");
//        System.out.print("Lady");
//        System.out.println("Gaga");
//        this.notifyAll();
//        i=1;
//    }
//}

//理解：等待唤醒机制
class Print{
    //    private Object obj=new Object();
    private int i =1;

    public synchronized void print1(){
        while (i==1) {
            System.out.print(Thread.currentThread().getName() + ":");
            System.out.print("Hello");
            System.out.println("World");
            i = 2;
        }
    }
    public synchronized void print2() {
        while (i==2) {
            System.out.print(Thread.currentThread().getName()+":");
            System.out.print("Poly");
            System.out.println("Thread");
            i=3;
        }
    }
    public synchronized void print3(){
        while (i==3) {
            System.out. print(Thread.currentThread().getName()+":");
            System.out.print("Lady");
            System.out.println("Gaga");
            i=1;
        }
    }
}
