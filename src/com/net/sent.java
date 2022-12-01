package com.net;

import java.io.IOException;
import java.net.*;
import java.util.logging.SocketHandler;

public class sent {
    public static void main(String[] args) throws IOException {
        DatagramSocket st=new DatagramSocket();
        String s="葬爱";
        DatagramPacket dp=new DatagramPacket(s.getBytes(),s.getBytes().length,InetAddress.getByName("192.168.16.1"),10086);
        st.send(dp);
        st.close();
    }
}
