package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/18/2019 - 8:30 PM
 */
public class Demo_12 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] c = str.toCharArray();
        for(int i = 0 ; i<c.length;i++){
            if( c[i] >='0'&&c[i]<='9' ){
                int i2 = c[i];
                sum +=i2;
            }
        }
        System.out.println(sum);
    }
}


