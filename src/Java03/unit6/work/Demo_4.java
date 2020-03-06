package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/19/2019 - 7:06 PM
 */
public class Demo_4 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        char[] c = str.toCharArray();

        for (char c1 :c){
            if((int)c1 >= '0' && (int)c1 <= '9'){
                sum += Integer.parseInt(String.valueOf(c1));
            }

        }
        System.out.println(sum);

    }
}
