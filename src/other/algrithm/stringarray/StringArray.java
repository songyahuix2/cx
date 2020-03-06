package other.algrithm.stringarray;


import sun.security.krb5.internal.tools.Klist;

import java.util.*;

/**
 * @author shkstart
 * @date 2019/11/10 - 16:30
 */
public class StringArray {
    public static List<String> list = new ArrayList<>();
        public static void main(String[] args) {
            Integer a = 128;
            Integer b = 128;
            System.out.println(a.equals(b));
            String s="abc";
            fullPermutation(s);
            String[] strings = new String[list.size()];
            for(int i = 0 ;i<list.size();i++){
                strings[i] = list.get(i);
                System.out.println("strings["+i+"]"+"="+strings[i]);
            }
        }
        private static void fullPermutation(String s) {
            permutation(s.toCharArray(),0,s.length()-1);
        }
        private static void permutation(char[] c, int start, int end) {
            if(start==end){
                String str1 = new String(c);
                System.out.println("str1:"+str1);
                list.add(str1);
                System.out.println("c:"+new String(c));
            }
            else {
                for(int i=start;i<=end;i++) {
                    if(i!=start && c[i]!=c[start] || i==start) {  //防止重复
                        swap(c,i,start);
                        permutation(c,start+1,end);    //继续深度搜索
                        swap(c,i,start);
                    }
                }
            }
        }
        private static void swap(char[] c, int i, int start) {
            char temp=c[i];
            c[i]=c[start];
            c[start]=temp;
        }
}

