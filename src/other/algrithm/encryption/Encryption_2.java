package other.algrithm.encryption;

import java.util.*;

/**
 * @author shkstart
 * @date 2019/10/23 - 21:05
 * Multiple people in A circle
 * 有n个人围成一圈，
 * 顺序排号从第一个人开始报数(从1到5报数),
 * 凡报到5的人退出圈子，
 * 问最后留下的是原来第几号的那位。
 */
public class Encryption_2 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("请输入排成一圈的人数：");
//        int n = s.nextInt();
//        boolean[] arr = new boolean[n];
//        for(int i=0; i<arr.length; i++) {
//            arr[i] = true;
//        }
//        int leftCount = n;
//        int countNum = 0;
//        int index = 0;
//        while(leftCount > 1) {
//            if(arr[index] == true) {
//                countNum ++;
//                if(countNum == 5) {
//                    countNum =0;
//                    arr[index] = false;
//                    leftCount --;
//                }
//            }
//            index ++;
//            if(index == n) {
//                index = 0;
//            }
//        }
//        for(int i=0; i<n; i++) {
//            if(arr[i] == true) {
//                System.out.println("原排在第"+(i+1)+"位的人留下了。");
//            }
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=true;
        }
        int leftCount = n;
        int countNum = 0;
        int index = 0;
        while (leftCount>1){
            if(arr[index]==true){
                countNum++;
                if(countNum==5){
                    countNum = 0;
                    arr[index] = false;
                    leftCount--;
                }
            }
            index++;
            if(index == n){
                index = 0;
            }
        }
        for (int i = 0;i<arr.length;i++){
            if(arr[i] == true){
                System.out.println("原排在第"+(i+1)+"位的人留下了。");
            }
        }
    }
}

