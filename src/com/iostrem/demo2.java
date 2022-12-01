package com.iostrem;


import java.io.*;

public class demo2 {
    public static void main(String[]args) throws IOException {
        FileInputStream fis=new FileInputStream("user.txt");
        FileOutputStream fos=new FileOutputStream("user_1.txt");
        byte[] bys=new byte[5];
        int len=0;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
    }
}
