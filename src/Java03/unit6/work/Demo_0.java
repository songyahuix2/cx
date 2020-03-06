package Java03.unit6.work;

import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/18/2019 - 4:58 PM
 */
public class Demo_0 {
    public static void main(String[] args) {
        System.out.println("输入年月份（格式:xxxx xx）");
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);

           if(month >=1 && month <=12){
               switch (month){
                   case 1:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 2:
                       if (year/400 == 0 ||year/4 == 0){
                           System.out.println(year+"-"+month+":"+"29天");

                       }
                       else
                           System.out.println(year+"-"+month+":"+"28天");
                       break;
                   case 3:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 4:
                       System.out.println(year+"-"+month+":"+"30天");
                       break;
                   case 5:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 6:
                       System.out.println(year+"-"+month+":"+"30天");
                       break;
                   case 7:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 8:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 9:
                       System.out.println(year+"-"+month+":"+"30天");
                       break;
                   case 10:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;
                   case 11:
                       System.out.println(year+"-"+month+":"+"30天");
                       break;
                   case 12:
                       System.out.println(year+"-"+month+":"+"31天");
                       break;

               }

        }


    }
}
