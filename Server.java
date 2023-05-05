package server;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9124);
            Socket socket = serverSocket.accept();

            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

            FileOutputStream fos = new FileOutputStream("/Users/hxrvelle/Documents/Java/Network/hellooo.png", true);
            byte[] buffer = bis.readAllBytes();
            fos.write(buffer);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
