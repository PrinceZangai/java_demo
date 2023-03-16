package com.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
public class demo1 {
    public static void main(String[] args) {
        B b=new B();
    }
}

@MyAnno1(aaa="1",bbb=1,ccc=MyEnum.M1)
class B{

}