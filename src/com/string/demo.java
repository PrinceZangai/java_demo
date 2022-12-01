package com.string;
import java.lang.String;
public class demo {
    public static void main(String[] args) {
//        String s1="abc";
//        String s2="abc";
//        String s3=new String("abc");
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));

//        String s1="abc";
//        String s2="ab";
//        String s3=s2+"c";
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//
//        String s1="abc";
//        String s2="ab"+"c";
//        System.out.println(s1==s2);
//
//        System.out.println("abcd".charAt(3));
//
//        //compareTo
//        System.out.println("abcde".compareTo("abcdh"));
//        System.out.println("abcde".compareTo("ab"));

        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abc");
        sb.append("cde");
        System.out.println(sb);

        System.out.println(sb.capacity());
        sb.append("123456789101010");
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
    }
}
