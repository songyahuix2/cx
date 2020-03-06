package java04.day17_proxy.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 8/6/2019 - 7:18 PM
 */
public class SearchWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] chars = str.toCharArray();
        int[] count = new int[128];
        for (int i = 0; i < chars.length; i++) {
            if (('A' <= chars[i] && chars[i] <= 'Z')|| (chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= '0' && chars[i] <= '9')) {
                ++count[chars[i]];//针对每个字符进行计数
                if (count[chars[i]] == 3) {
                    System.out.println(chars[i]);
                    break;
                }
            }

        }
        }
}
