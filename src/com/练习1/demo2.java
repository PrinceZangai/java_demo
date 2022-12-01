package com.练习1;
import java.util.ArrayList;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("a001","黄渤",1.72 ));
        al.add(new Student("a002","孙红雷",1.78));
        al.add(new Student("a003","章子怡",1.64));
        al.add(new Student("a004","杨颖",1.68));

        for(int i=0;i<4;i++){
            al.get(i).print();
        }
        System.out.println(al.size());
        Student s=al.get(3);
        s.print();
        al.set(0,new Student("a005","撒贝宁",1.67));
        Iterator it=al.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            Student s1=(Student)obj;
            s1.print();
        }


    }
}
class Student{
    private String code;
    private String name;
    private double height;
    public Student(){}
    public Student(String code,String name,double height){
        this.name=name;
        this.code=code;
        this.height=height;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void print(){
        System.out.println(this.getCode());
        System.out.println(this.getName());
        System.out.println(this.getHeight());
    }
}
