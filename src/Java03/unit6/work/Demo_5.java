package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/19/2019 - 7:37 PM
 */
public class Demo_5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int num = scanner1.nextInt();
        String str = scanner2.nextLine();
        String[] strArr = str.split(" ");
        for (String str1 : strArr) {
            if (str1.toCharArray().length == num) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }

}
