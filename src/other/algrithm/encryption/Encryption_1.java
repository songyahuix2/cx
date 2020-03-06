package other.algrithm.encryption;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 2019/10/23 - 20:44
 * 加密算法：
 * 数据是四位的整数对其加密规则如下：
 * 每位数字都加上5,然后用和与10求余后的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换，计算加密后的整数。
        */
public class Encryption_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位数：");
        int x = scanner.nextInt();
        Encryption_1 encryption1 = new Encryption_1();
        System.out.println("加密之后的数字是:"+encryption1.encryption(x));
    }
    public static int encryption(int x){
//        假设该四位数是abcd,将该四位数进行拆分
        int a = x/1000;
        System.out.println("A:"+a);
        int b = x%1000/100;
        System.out.println("b:"+b);
        int c = x%100/10;
        System.out.println("c:"+c);
        int d = x%10;
        System.out.println("d:"+d);
//        每位数字加上5，然后用和除以10的余数代替该数字；
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        x=d*1000+c*100+b*10+a;
        return x;
    }

}
