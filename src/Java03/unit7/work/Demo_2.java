package Java03.unit7.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/20/2019 - 10:17 AM
 */
public class Demo_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            String[] month = {"JANUARY","FEBRUARY","MARCH" , "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
            sdf.parse(str);
            System.out.println(month[cal.get(Calendar.MONTH)+1]);


        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
