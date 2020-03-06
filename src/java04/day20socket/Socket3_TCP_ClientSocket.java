package java04.day20socket;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Socket3_TCP_ClientSocket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1",8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.getOutputStream().write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
