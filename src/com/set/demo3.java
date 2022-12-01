package com.set;

import java.util.TreeSet;

public class demo3 {
    public static void main(String[] args) {

        String s1="aaabbb";
        String s2="aaac";
        System.out.println(s1.compareTo("aaabbb"));
        System.out.println(s1.compareTo("aaac"));
        System.out.println(s1.compareTo("aa"));
//        TreeSet<Employee> ts=new TreeSet<Employee>( );
//        ts.add(new Employee("张三",28,50000));
//        ts.add(new Employee("李四",18,80000));
//        ts.add(new Employee("王五",38,50000));
//        ts.add(new Employee("蔡徐坤",19,2000));
//        ts.add(new Employee("老刘",58,70000));
//        ts.add(new Employee("aa",28,50000));
//        ts.add(new Employee("aa",28,50000));
//
//        for (Employee e:ts){
//            System.out.println(e.getName()+"..."+e.getAge()+"..."+e.getSalary());
//        }
    }
}
class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private  int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int i=o.getSalary()-this.getSalary();
        int ii= i==0?this.getAge()-o.getAge():i;
        int iii= ii==0?this.getName().compareTo(o.getName()):ii;
        int iiii=iii==0?1:iii;
        return iiii;
//        int i=o.getSalary()-this.getSalary();
//        if(i!=0){return i;}
//        else{
//            int j=this.getAge()-o.getAge();
//            return j==0?this.getName().compareTo(o.getName()):j;
//        }
    }
}