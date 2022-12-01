package com.net;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(12306);

        Socket s=ss.accept();
        byte[]  bys=new byte[1024];
        InputStream is=s.getInputStream();
        int len=is.read(bys);
        FileOutputStream fos=new FileOutputStream("src/com/net/a.txt");
        fos.write(bys,0,len);
        fos.close();

    }
}
