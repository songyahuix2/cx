package java04.day20socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Socket2_TCP_ServerSocket {
    public static void main(String[] args) {
        byte[] bs = new byte[1024];
        while (true){
            try {
                System.out.println("wait conn");
                ServerSocket serverSocket = new ServerSocket(8080);
                Socket socket = serverSocket.accept();
                System.out.println("conn success");
                socket.getInputStream().read(bs);
                System.out.println(new String(bs));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
