package java04.day10.work.problem_1;

/**
 * @author shkstart
 * @date 7/26/2019 - 7:43 PM
 */
public class Encryption {
    public static void encryption(String str1){
        String str2 = str1.substring(0,1);
        String str3 = str1.substring(1,str1.length()).concat(str2);
        System.out.println(str3);
        char[] chars1 = str3.toCharArray();
        for(int i1 = 0 ;i1<chars1.length;i1++){
            chars1[i1] = (char) (chars1[i1]+3);
        }
        System.out.println(chars1.toString());
    }
}
