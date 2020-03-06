package Java03.unit7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shkstart
 * @date 7/20/2019 - 9:10 AM
 */
public class DateDemo {
    public static void main(StringDemo[] args) {
        //创建一个获取当前系统时间的Date对象
        Date date = new Date();
        Date date1 = new Date();
        //
        System.out.println(date);
        System.out.println(date.getTime());
        date1.setTime(-647164711);
        System.out.println(date.equals(date1));
        System.out.println(date1.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        System.out.println(date.toString());
        try {
            sdf.parse("2018-02-03 23:23:23");

        } catch (ParseException e) {
            System.out.println("格式报错");
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
    }
}
