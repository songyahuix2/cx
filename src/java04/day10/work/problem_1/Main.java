package java04.day10.work.problem_1;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/26/2019 - 7:41 PM
 */
public class Main {
    public static void main(String[] args) {
        //加密
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        Encryption.encryption(str1);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("还原请按1");
        int reduction = scanner1.nextInt();
        if(reduction ==1){
            Reduction.reduction(str1);
        }
        else
            return;


        }
    }
