package com.iostrem;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入账户");
        String a=input.next();
        System.out.println("请输入密码");
        String b=input.next();
        HashMap<String,String> hp=new HashMap<>();
        BufferedReader br=new BufferedReader(new FileReader("user.txt"));

        String line;
        while ((line=br.readLine())!=null){
            String id=line.split(",")[0];
            String password=line.split(",")[1];
            hp.put(id,password);
        }
        if(hp.containsKey(a)){
            if(hp.get(a).equals(b)){
                System.out.println("登录成功");
            }
            else{
                System.out.println("密码错误");
            }
        }
        else{
            BufferedWriter bw=new BufferedWriter(new FileWriter("user.txt",true));
            bw.write("\n"+a+","+b);
            bw.close();
            System.out.println("注册成功");
        }


    }


}
