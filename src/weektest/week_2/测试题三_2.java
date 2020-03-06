package weektest.week_2;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * @author shkstart
 * @date 8/8/2019 - 8:09 AM
 */
public class 测试题三_2 {

    public static void main(String[] args) {
        //创建集合
         List<Staff> list = new ArrayList<>();
         //用集合盛放读入的数据
         Read_To_List readToList = new Read_To_List(list);
         readToList.read();
         //统计部门-（员工1，员工2，员工3...）
         Statistics statistics = new Statistics(list);
         statistics.statistics();
        Set<Map.Entry<String, List<Staff>>> set = statistics.map.entrySet();
        System.out.println(statistics.map);
         //在map集合中查询相关的部门，再查出满足薪资查询要求的员工降序排列


             }
}
