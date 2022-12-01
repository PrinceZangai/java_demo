package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpReceive {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10086);
        Socket s=ss.accept();
        InputStream is=s.getInputStream();
        byte[]  bys=new byte[1024];

//        读取数据进入bys数组中
        int len=is.read(bys);
        String data=new String(bys,0,len);
        System.out.println(data);

        s.close();
        ss.close();
    }
}
