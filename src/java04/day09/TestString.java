package java04.day09;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shkstart
 * @date 7/26/2019 - 9:22 AM
 */
public class TestString {
    public static void main(String[] args) throws ClassNotFoundException {
       String str = "attasssssattttatttttt";
       String str1 = str.toUpperCase();
       String str2 = str1.toLowerCase();
       char c = str.charAt(0);
       String[] c1  = str.split(".");
       int length = str.length();
       String str3 = str.concat(str1);
       String str4 = str.replaceAll("a","Z");
       int i = str.indexOf("A");
       String str5 = "clone-finalize-getClass-notify-notifyAll-wait";
       String[] strArr = str5.split("-");
        for (String arr:strArr
             ) {
       System.out.println(arr);
        }
        String intCast = String.valueOf(76);

       //加密
        String str6 = "abscbactt";
        String str7 = str6.substring(0,1);
        String str8 = str6.substring(1,str6.length()).concat(str7);
        System.out.println(str8);
        char[] chars1 = str8.toCharArray();
        for(int i1 = 0 ;i1<chars1.length;i1++){
            chars1[i1] = (char) (chars1[i1]+3);
        }
        System.out.println(chars1.toString());
        String str9 = chars1.toString();
        String regex = "[A-Z@b]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str9);
        int index = 0;
        while (m.find()){
           // System.out.println(m.group());
           // System.out.println(m.start()+":"+m.end());
            index = m.start();
            System.out.println(index);
        }
/*
        System.out.println(c2);
        str9.replace(chars1[index],);
        System.out.println(str9);*/
    }
}
