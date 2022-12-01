package com.练习1;
import java.util.ArrayList;
public class demo {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList();
        al.add("孙悟空");
        al.add("猪八戒");
        al.add("沙和尚");
        al.add("铁扇公主");
        System.out.println(al);
        System.out.println(al.get(3));
        al.remove("铁扇公主");
        al.remove(2);
        al.set(al.indexOf("猪八戒"),"猪悟能");
        System.out.println(al);
    }
}

