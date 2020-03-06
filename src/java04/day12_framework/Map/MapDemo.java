package java04.day12_framework.Map;

import java.util.*;

/**
 * @author shkstart
 * @date 7/30/2019 - 3:29 PM
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map= new HashMap<>();
        map.put("zhongguo","hanzi");
        map.put("meiguo","yingyv");
        map.put("hanguo","hanyv");
        map.put("riben","ryv");
        map.put("yingguo","yingyv");
        System.out.println(map);
        System.out.println(map.get("riben"));
        System.out.println(map.size());
        System.out.println(map.remove("hanguo"));
        System.out.println(map);
        System.out.println(map.put("riben","guoyv"));
        System.out.println(map.keySet());
        for (String key:map.keySet()
             ) {
            System.out.print(map.get(key)+'\t');
        }
//        Set<Map.Entry<String,String>> entrySet= map.entrySet();
//        Iterator<Map.Entry<String, String>> it  = entrySet.iterator();
//        for(;it.hasNext();){
//            System.out.println(it.next().getKey());
//            System.out.println(it.next().getValue());
//        }
//        Set<Map.Entry<String,String>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next().getKey()+"..."+it.next().getValue());
//        }
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,String>> it = entrySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getKey());
            System.out.println(it.next().getValue());
        }
       Collection<String> collection = map.values();
        System.out.println(map.containsKey("zhongguo"));
        System.out.println(map.containsValue("hanyv"));
    }
}
