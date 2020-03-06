package java04.day10.work.Problem_10;

/**
 * @author shkstart
 * @date 7/26/2019 - 9:08 PM
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "adbccadebbcaaaaaa";
        String str2 = "edabccadeceaaaaaa";
        int i,j,len = 0,t,n;
        int k = 0;
        int f,num;
        Tenjudge judge = new Tenjudge();
        String[] x= new String[100];
        String cache;
        for(i = 0; i < str1.length();i++)
            for(j = 0;j < str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    cache = judge.Tjudge(str1,str2,i,j);//返回相同的子串
                    num = 0;
                    for(n = 0;n < cache.length();n++)//相同子串的长度
                        if(cache.charAt(n) != 0)
                            num++;


                    if(num > len){//大于之前最大串就放入第一个数组
                        len = num;
                        k = 0;
                        x[k] = cache;
                    }
                    if(num == len){//等于最大串就放到下一个数组
                        x[k++] = cache;
                    }
                }
            }

        for(i = 0;i < k;i++)
            System.out.println(x[i]);
    }
}
