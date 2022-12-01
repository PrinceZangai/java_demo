package com.set;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class demo2 {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("ccc");
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);
        swap(list,1,2);
        System.out.println(list);


    }
    public static void swap(List<String> list, int a, int b){
        String temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }

}


