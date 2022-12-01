package com.set;

public class demo1 {
    public static void main(String[] args) {



    }
}
class Pig implements Comparable<Pig>{
    private String name;
    private int age;

    public Pig(){}
    public Pig(String name, int age) {
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

    @Override
    public int compareTo(Pig o) {
        return this.getAge()-o.getAge();
    }
}
