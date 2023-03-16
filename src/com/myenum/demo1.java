package com.myenum;

//枚举的实现原理
public class demo1 {
    public static void main(String[] args) {
//        Week mon=Week.mon;
//        System.out.println(mon.getName());
//        Week tue=Week.tue;
//        System.out.println(tue.getName());
//        Week wed=Week.wed;
//        System.out.println(wed.getName());
    }
}

//思路一，既然枚举表示一个类的所有实例只能是几个固定的值，参考单例模式的设计思路，我们可以在类中将构造方法设置为私有
//然后定义几个静态成员变量，初始化的时候使用构造方法生成实例，这样就保证了类在加载进方法区的时候就生成了固定的几个实例，后续使用直接类名.静态变量调用就可以了
//class Week{
//    public static Week mon=new Week();
//    public static Week tue=new Week();
//    public static Week wed=new Week();
//
//    private Week() {
//    }

//格式二
//现在加一点需求，考虑类中的成员变量（虽然这些变量在类加载是便已经赋值），那么构造方法就需要改写成有参的构造方法。
// 如果成员变量设置为私有，那么我们还需要写一个公开的接口供外界访问。
//class Week{
//    public static Week mon=new Week("星期一");
//    public static Week tue=new Week("星期二");
//    public static Week wed=new Week("星期三");
//    private String name;
//    private Week() {
//    }
//    private Week(String name) {
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }

//最后，将以上设计思路在编译器层面实现，语法糖声明enum，编译器会自动将代码转化成符合要求的格式。
//enum Week{
//    MON("星期一"){
//      因为是实例，所以
//        public void show(){
//
//        }
//    },
//    TUE("星期二"){
//        public void show(){
//
//        }
//    },
//    WED("星期三"){
//        public void show(){
//
//        }
//    };
//    private String name;
//    private Week(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
//    public abstract void show();
//}