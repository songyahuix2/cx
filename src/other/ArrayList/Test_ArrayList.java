package other.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @date 2019/10/23 - 23:03
 */
public class Test_ArrayList {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("A","aa");
        map.put("b","bb");
        Set<Map.Entry<String,String>> setEntry =  map.entrySet();
        Iterator<Map.Entry<String,String>> iterator = setEntry.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.isEmpty());
        arrayList.add("test");
        System.out.println(arrayList.size()+":"+arrayList.get(0));
        arrayList.add("test1");
        System.out.println(arrayList.size()+":"+arrayList.get(0));
    }
}
