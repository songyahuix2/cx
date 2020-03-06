package Java03.unit7.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/20/2019 - 8:14 AM
 */
public class Demo_1 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            System.out.println(sdf.parse(str));
            cal.setTime(sdf.parse(str));
            if(cal.get(Calendar.YEAR)/4 == 0 || cal.get(Calendar.YEAR)/400 == 0){
                System.out.println("true");
            }
            else
                System.out.println("false");
        } catch (ParseException e) {
            System.out.println("格式异常");
            e.printStackTrace();
        }
    }
}
