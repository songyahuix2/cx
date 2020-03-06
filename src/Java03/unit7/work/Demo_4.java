package Java03.unit7.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/20/2019 - 11:21 AM
 */
public class Demo_4 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String str1  = scanner1.nextLine();
        String str2 = scanner2.nextLine();
        try {
            date1 = sdf1.parse(str1);
            date2 = sdf2.parse(str2);
            int b = date1.compareTo(date2);
                cal.setTime(date1);
                int year1 = cal.get(Calendar.YEAR);
                int month1 = cal.get(Calendar.MONTH);
                cal.setTime(date2);
                int year2 = cal.get(Calendar.YEAR);
                int month2 = cal.get(Calendar.MONTH);
                if(year1>year2){
                    System.out.println(month1+12-month2+(year1-1-year2)*12);
                }
                if(year1<year2){
                    System.out.println(month2+12-month1+(year2-1-year1)*12);
                }
               else
                    System.out.println(0);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
