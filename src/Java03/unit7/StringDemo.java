package Java03.unit7;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/22/2019 - 1:14 PM
 */
public class StringDemo {
    public static String str ="";
    public static void main(String[] args) {
        System.out.println(str.isEmpty());
        String str2 = "add test";
        System.out.println(str.concat(str2));
        String str3 = new String("海内存知己");
        char[] chArr = {'a','b','c','d','e','f','g'};
        String strDemo2 = new String(chArr);
        System.out.println(chArr);
        String strDemo3 = new String(chArr,0,2);
        System.out.println(strDemo3);
        String str4 = Arrays.toString(chArr);
        System.out.println(str4);
        System.out.println(str4.substring(0,2));
        System.out.println(str4.substring(2));
        System.out.println(str4.indexOf("b",2));
        System.out.println((int)'a');
        String str5 = "aest";
        System.out.println(str5.lastIndexOf('t'));
        String str6 = "zest";
        System.out.println( str5.compareTo(str6));
        System.out.println(Arrays.toString(str6.getBytes()));

    }

}
