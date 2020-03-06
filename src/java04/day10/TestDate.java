package java04.day10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shkstart
 * @date 7/26/2019 - 10:12 AM
 */
public class TestDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date();
        System.out.println("距离格林尼治时间（ms）:"+date.getTime());
        System.out.println("当前时间："+date);
        date1.setTime(131441200l);
        System.out.println("设置时间："+date);
        System.out.println( date.after(date1));
        System.out.println( date.before(date1));
        System.out.println( date.equals(date1));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM-dd HH:mm:ss");
        System.out.println(sdf.toPattern());
        System.out.println(sdf.format(date));
        try {

            System.out.println(sdf.format(sdf.parse("2018--12--03 23:22:12")));
        } catch (ParseException e) {
            e.printStackTrace();

        }
        Calendar calender =  Calendar.getInstance();
        calender.setTime(date);
        System.out.println(calender.get(Calendar.HOUR_OF_DAY));
    }
}
