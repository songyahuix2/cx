package java04.day11_手写Array集合.work.Test_3;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 7/29/2019 - 8:23 PM
 */
public class ClassMain {
    public static void main(String[] args) {
        ArrayList<Course> arrayList = new ArrayList<>();
        arrayList.add(new Course("1101","数据结构",2));
        arrayList.add(new Course("1102","数据库",3));
        arrayList.add(new Course("1103","Java",5));


          for(Course cou:arrayList){
             if(cou.getName().equals("数据库")){
                 cou.setName("数据结构");
                 System.out.println(cou.getName());
             }

          }
int achieve = 10;
          for(Course cou:arrayList){
              if(cou.getCredit() < achieve){
                        achieve = cou.getCredit();
              }
          }
for(Course cou:arrayList){
    if(cou.getCredit() == achieve){
        arrayList.remove(cou);
    }
}


    }
}
