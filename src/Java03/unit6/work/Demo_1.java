package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/18/2019 - 8:07 PM
 */
public class Demo_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String repStr=str.replaceAll("[a-zA-Z]","");
        System.out.println(repStr);
    }
}
