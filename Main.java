package org.example;

import java.io.*;
import java.net.Socket;
import java.util.Timer;
import java.util.TimerTask;


public class Main {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.1.37", 9124);
            FileInputStream fis = new FileInputStream("/Users/hxrvelle/Documents/Java/Network/hell.png");
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            byte[] buffer = new byte[16384];
            //byte[] buffer = new byte[1024];
            int i;
            while ((i=fis.read(buffer)) != -1) {
                bos.write(buffer,0, i);
                System.out.println(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}