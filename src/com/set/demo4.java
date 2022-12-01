package com.set;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class demo4 {
    public static void main(String[] args) {

        Map<Student, String> hp = new HashMap<Student, String>();

        hp.put(new Student("Tom", 25), "北京");
        hp.put(new Student("Jerry", 24), "天津");
        hp.put(new Student("Rose", 14), "南京");
        hp.put(new Student("Tom", 25), "武汉");

        for(Student key:hp.keySet()){
            System.out.println(key.getName()+"::"+hp.get(key));
        }

        for (Entry<Student,String> entry:hp.entrySet()){
            System.out.println(entry.getKey().getName()+"::"+entry.getValue());
        }



    }

}

class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.println(this.getName()+"..."+this.getAge()+"...");
    }

}