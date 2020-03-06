package java04.day10.work.Problem_10;

/**
 * @author shkstart
 * @date 7/29/2019 - 8:25 AM
 */
public class Tenjudge {
    public static String Tjudge(String a,String b ,int i,int j){

        char[] c =new char[a.length()];
        int k = 0;

        do{
            if(a.charAt(i) == b.charAt(j))
                c[k++] = b.charAt(i);
            else
                break;
            i++;
            j++;
        }while(i < a.length()&&j < b.length());
        String d = String.valueOf(c);
        return d;
    }
}
