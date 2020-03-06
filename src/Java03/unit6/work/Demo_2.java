package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/19/2019 - 4:56 PM
 */
public class Demo_2 {
    public static boolean isunique(String s) {
        int index1,index2;
        char[] chars = s.toCharArray();
        for(char c:chars) {
            index1 = s.indexOf(c);
            index2 = s.lastIndexOf(c);
            if(index1 != index2)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int index1,index2;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String str = "[a-zA-Z]*";
        String str1 = scanner1.nextLine();
        String str2 = scanner2.nextLine();
        if(str1.matches(str) && str2.matches(str)){
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        }
    }
}