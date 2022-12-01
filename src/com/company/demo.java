package com.company;

public class demo {
    public static void main(String[] args) {
//        Zi zi=new Zi();
//        zi.printZi();
//        zi.printFu();
        Person p1=new Person(18);
        Person p2=new Person(18);
        System.out.println(p1.equals(p1));
        System.out.println(p1.equals(p2));
    }
}
class Fu{
    public void printFu(){
        System.out.println("fu...");
    }
}
class Zi extends Fu{
    public void printZi(){
        System.out.println("zi...");
    }
}

//equals接口
class Person extends Object{
    private int age=0;
    public Person(){};
    public Person(int age){
        this.age=age;
    }
    @Override
    public boolean equals(Object obj){
        Person p=(Person)obj;
        return (this.age==p.age);
    }
}







