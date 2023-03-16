package com.myenum;

import com.annotation.MyEnum;

public class demo2 {
    public static void main(String[] args) {
        Week mon=Week.MON;
        System.out.println(mon.getName());
        Week tue=Week.TUE;
        System.out.println(tue.getName());
        Week wed=Week.WED;
        System.out.println(wed.getName());
        switch (mon){
            case MON:
                System.out.println("mon");
            case TUE:
                System.out.println("tue");
            case WED:
                System.out.println("wed");
        }

        System.out.println(MyEnum.M1);
    }
}

//格式一
//enum Week{
//    MON,TUE,WED
//}

//格式二
//enum Week{
//    MON("星期一"),TUE("星期二"),WED("星期三");
//    private String name;
//    private Week(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
//}

//格式三，枚举类中可以有抽象方法，但枚举项必须实现此抽象方法
enum Week{
    MON("星期一"){
        public void show(){

        }
    },
    TUE("星期二"){
        public void show(){

        }
    },
    WED("星期三"){
        public void show(){

        }
    };
    private String name;
    private Week(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public abstract void show();
}

