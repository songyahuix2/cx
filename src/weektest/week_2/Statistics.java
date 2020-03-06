package weektest.week_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shkstart
 * @date 8/8/2019 - 7:57 PM
 */
public class Statistics {
    Map<String, List<Staff>>  map = new HashMap<>();
List<Staff> list = null;
public Statistics(List<Staff> list){
    this.list = list;
}
    public void statistics(){
        for (Staff s:list) {
            if(!map.containsKey(s.getDepart())){
                List<Staff> list = new ArrayList<>();
                list.add(s);
                map.put(s.getDepart(),list);
            }
            else
                map.get(s.getDepart()).add(s);
        }
    }
}
