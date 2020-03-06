package java04.day17_proxy.work;

/**
 * @author shkstart
 * @date 8/6/2019 - 7:49 PM
 */
public class Palindrome {
    public static void main(String[] args) {
        String[] str = {"abcda","google"};
        Palindrome fi = new Palindrome();

        for(int i = 0;i < str.length;i++){
            int a =  fi.MaxLenth(str[i]);
            System.out.println(a);
        }
    }


    public int MaxLenth(String str) {

        int len = str.length();
        StringBuffer reStr = new StringBuffer(str);
        reStr = reStr.reverse();
        System.out.println(reStr);
        int[][] arr = new int[len+1][len+1];
        for(int i = 0;i<len+1;i++){

            arr[0][i] = arr[i][0] = 0;

        }
        for(int i = 1;i<len+1;i++){
            for(int j = 1;j<len+1;j++){
                if(str.charAt(i-1)==reStr.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1]+1;
                else
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
            }
        }
        return len-arr[len][len];
    }
}


