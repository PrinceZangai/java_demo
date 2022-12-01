package com.reflect;

import java.lang.reflect.Field;

public class demo1 {
    public static void main(String[] args) throws Exception{
        Class clazz=Class.forName("com.reflect.Person");
        Object obj=clazz.newInstance();
        Field nameField=clazz.getField("name");
        Field ageField=clazz.getField("age");
        nameField.set(obj,"Tom");
        ageField.set(obj,12);
        System.out.println(obj);
    }
}
