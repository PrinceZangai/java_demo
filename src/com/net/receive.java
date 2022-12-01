package com.net;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10086);
        byte[] bys=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        String ip=dp.getAddress().getHostAddress();
        String data=new String(bys,0,dp.getLength());
        System.out.println(ip);
        System.out.println(data);



    }
}
