package other.algrithm.sort;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author shkstart
 * @date 7/23/2019 - 8:14 AM
 */
class fa{
    public String str = "test";
    public void test(){
        System.out.println("overrade");
    }
}

public class 练习 extends fa{

    public static int i ;
        
    public static void main(String[] args) {
        int a = 0;
        List<String> list = new ArrayList<>(3);
        list.add(new String("test"));
        for(String s:list){
            System.out.println("循环"+(a+=1)+"次");
        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println("迭代循环");
            break;
        }
        String str=" 123456789";
        char mychar = 'c';
        switch (mychar){
            default:
                System.out.println("mychar_c");
            case 'A':
                System.out.println("mychar_A");
                break;
            case 'b':
                System.out.println("mychar_b");
        }
        System.out.println(str.lastIndexOf("5",4));
        System.out.println(str.indexOf("5"));
        System.out.println(i);
        int[] arr = {4, 1, 6, 52, 0, 19, 11, 0, 5, 13};
        //selectSort(arr);
        //quickSort(arr, 0, arr.length - 1);
        //insertSort(arr);
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr){
//        for(int i = 0;i<arr.length-1;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
    }
    public static void quickSort(int[] arr,int low,int high){
           int start = low;
           int end = high;
           int base = arr[low];
           while (start<end){
               while (start<end && arr[end]>=base){
                   end--;
               }
               if(arr[end] < base){
                   arr[start] = arr[end];
               }
               while (start<end && arr[start]<=base){
                   start++;
               }
               if(arr[start]>base){
                   arr[end] = arr[start];
               }
           }
           arr[end] = base;
           if(low<start){
              quickSort(arr,low,start-1);
           }
           if(end<high){
               quickSort(arr,end+1,high);
           }

   }
    public static void insertSort(int[] arr){
//        int i,j,temp;
//        for(i = 1;i<arr.length;i++){
//            temp = arr[i];
//            for(j=i-1;j>=0;j--){
//                if(arr[j]>temp){
//                    arr[j+1] = arr[j];
//                }
//                else
//                    break;
//            }
//            arr[j+1] = temp;
//        }
        int i,j,temp;
        for(i=1;i<arr.length;i++){
            temp = arr[i];
            for(j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else
                    break;
            }
            arr[j+1]=temp;
        }

}
    public static void bubbleSort(int[] arr){
//            int i,j;
//            for(i = 0;i<arr.length-1;i++){
//                for(j=0;j<arr.length-1-i;j++){
//                    if(arr[j]>arr[j+1]){
//                        int temp;
//                        temp = arr[j];
//                        arr[j] = arr[j+1];
//                        arr[j+1] = temp;
//                    }
//                }
//            }
            int i,j,temp;
            for(i=0;i<arr.length-1;i++){
                for (j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        temp = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
       }
    }







