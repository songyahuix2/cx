package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/19/2019 - 8:06 PM
 */
public class Demo_6 {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String str = scan.nextLine();
String[] strArr = str.split("\\.");
String str1 = "[0-2][0-5]{2}";

        for (int i = 0 ; i<strArr.length;i++) {
            if(!strArr[i].matches(str1)){
                System.out.println("Invalid");
                break;
            }
            else {
                if (i == 3) {
                    System.out.println("valid");
                }
            }
        }
    }
}
