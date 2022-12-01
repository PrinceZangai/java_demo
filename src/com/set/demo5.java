package com.set;

import java.util.HashMap;
import java.util.Map;

public class demo5 {
    public static void main(String[] args) {
        String s="1.2,3.4,5.6,7.8,9.10,5.56,44.55";
        HashMap<String,String> hp=new HashMap<>();
        String arr[]=s.split(",");
        for(String s1:arr){
            String key=s1.split("\\.")[0];
            String value=s1.split("\\.")[1];
            hp.put(key,value);
        }
        for(String k:hp.keySet()){
            System.out.println(k+"..."+hp.get(k));
        }

    }
}
