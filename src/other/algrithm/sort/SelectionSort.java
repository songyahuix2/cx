package other.algrithm.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author shkstart
 * @date 7/23/2019 - 2:45 PM
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 11, 3, 29, 49, 30, 7, 50, 63, 46, 1, 99 };
        selectionSort(arr);
    }

    private static void selection(int[] arr) {
        int i,j,temp;
        for(i=0;i<arr.length-1;i++){
            for(j=i;j<arr.length;j++){
                if(arr[j+1]>=arr[i]){
                    continue;
                }
                temp = arr[j+1];
                arr[j+1]=arr[i];
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr){
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
