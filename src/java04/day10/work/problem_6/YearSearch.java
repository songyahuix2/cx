package java04.day10.work.problem_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author shkstart
 * @date 7/26/2019 - 7:18 PM
 */
public class YearSearch {
    public static boolean search(String str){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(str);
        } catch (ParseException e) {
            //  e.printStackTrace();
            e.getMessage();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        if(year%4 == 0&&year%100!=0 | year%400==0 ){
            return true;
        }
        else
            return false;
    }

}
