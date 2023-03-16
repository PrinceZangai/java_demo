package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class demo3 {
    public static void main(String[] args) {

    }
}

//@MyAnno2
class C{
    @MyAnno2
    private int age;

    public void ccc(){};
}
