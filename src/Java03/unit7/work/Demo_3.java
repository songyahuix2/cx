package Java03.unit7.work;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shkstart
 * @date 7/20/2019 - 10:33 AM
 */
public class Demo_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
          cal.setTime(sdf.parse(str));
          if((cal.get(Calendar.MONTH)+1)>=1&&(cal.get(Calendar.MONTH)+1)<=12 && (Math.floor(cal.get(Calendar.YEAR)/1000)>=0 && Math.floor(cal.get(Calendar.YEAR)/1000) <=9)){
          if(Math.floor(cal.get(Calendar.YEAR)/4) == 0 || Math.floor(cal.get(Calendar.YEAR)/400) == 0){
          if((cal.get(Calendar.MONTH)+1) ==2 && ((cal.get(Calendar.DATE))>=1 && (cal.get(Calendar.DATE)<=29))){
             System.out.println("true");
          }
          else if(((cal.get(Calendar.DATE))>=1 && (cal.get(Calendar.DATE)<=31))){
              System.out.println("true");
          }
          else
              System.out.println("false");
            }
          else{
              if((cal.get(Calendar.MONTH)+1) ==2 && ((cal.get(Calendar.DATE))>=1 && (cal.get(Calendar.DATE)<=28))){
                  System.out.println("true");
              }
              else if(((cal.get(Calendar.DATE))>=1 && (cal.get(Calendar.DATE)<=31))){
                  System.out.println("true");
              }
              else
                  System.out.println("false");
          }

          }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
