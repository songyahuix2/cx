package java04.day10.work.problem_1;

/**
 * @author shkstart
 * @date 7/26/2019 - 7:49 PM
 */
public class Reduction {
    public static void reduction(String str1) {
        String str2 = str1.substring(0,1).concat(str1.substring(1,str1.length()));
        System.out.println(str2);

    }
}
