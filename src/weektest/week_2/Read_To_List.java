package weektest.week_2;

import java04.day10.DateUtils;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author shkstart
 * @date 8/8/2019 - 8:11 AM
 */
public class Read_To_List {
    List<Staff> list = null;
    public Read_To_List(List<Staff> list){
        this.list = list;
    }
       public File file = new File("F:\\01_Program\\java\\idea\\cx\\src\\weektest\\week_2\\emp.txt");
    public void read(){
        String line = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(this.file))) ;
            while ((line = br.readLine())!=null){
                String[] str = line.split("[|]");
                int empNo = Integer.valueOf(str[0]);
                String empName = str[1];
                int empGender = Integer.valueOf(str[2]);
                Date empHiredate = null;
                try {
                    empHiredate = new SimpleDateFormat("yyyyMMdd").parse(str[3]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String empDept = str[4];
                float empSalary = Float.parseFloat(str[5]);
                Staff staff = new Staff(empNo,empName,empGender,empHiredate,empDept,empSalary);
               list.add(staff);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }