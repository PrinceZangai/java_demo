package com.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class tcpSend {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.16.1",10086);
        OutputStream os=s.getOutputStream();
        System.out.println(os.getClass().getName());
        String data="葬爱os";
        os.write(data.getBytes());

    }
}
