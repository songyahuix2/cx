package java04.day20socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Socket1_InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        InetAddress ip1 = InetAddress.getByName("www.baidu.com");
//        InetAddress ip2 = InetAddress.getByName("www.github.com");
        InetAddress[] iparr = InetAddress.getAllByName("www.baidu.com");
        InetAddress[] iparr2 = InetAddress.getAllByName("www.github.com");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
        System.out.println(ip1.getHostAddress());
        System.out.println(ip1.getHostName());
        System.out.println(Arrays.toString(iparr));
        System.out.println(Arrays.toString(iparr2));
    }
}
