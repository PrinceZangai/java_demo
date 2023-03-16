package com.annotation;

import javax.xml.bind.Element;
import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class demo2 {
    public static void main(String[] args) {
        MyEnum myEnum=MyEnum.M1;
//        System.out.println(myEnum);
        MyEnum m1=MyEnum.M1;
        System.out.println(m1);
    }
}

class A{

}
