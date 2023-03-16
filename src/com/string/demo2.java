package com.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="约吗";
        byte[] bs1=s.getBytes("UTF-8");
//        utf-8:[-28, -72, -83, -27, -101, -67]
        byte[] bs2=s.getBytes("GBK");
//          gbk[-42, -48, -71, -6]
        byte[] bs3=s.getBytes();
        System.out.println(Arrays.toString(bs2));
    }
}
