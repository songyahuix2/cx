package other.algrithm.sort;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/22/2019 - 9:17 AM
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] array={23,34,25,66,21};
        test1(array);
    }
    public static void test1(int[] array) {
        int i,j,temp;
        for(i=1;i<array.length;i++) {
            temp=array[i];
            for(j=i-1;j>=0;j--) {
                if(temp>array[j]) {
                    break;
                }else {
                array[j+1]=array[j];
            }
            }
            array[j+1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }


}

