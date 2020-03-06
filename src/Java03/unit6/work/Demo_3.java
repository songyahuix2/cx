package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/18/2019 - 8:33 PM
 */
public class Demo_3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        String str = "[A-zA-Z]";

        String str1 = scanner1.nextLine();
        String str2 = scanner2.nextLine();
        String str3 = scanner3.nextLine();

        String[] strArr = {str1,str2,str3};
        String str4 = "";
        for (int i = 0;i<strArr.length;i++){
            if(strArr[i].endsWith(str)){
               str4.concat(strArr[i].substring(strArr[i].length()-1));
            }
        }
        System.out.println(str4);

    }
}
