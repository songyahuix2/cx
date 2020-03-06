package java04.day12_framework.Map.面试题_Map;

import java.util.*;

/**
 * @author shkstart
 * @date 7/30/2019 - 4:56 PM
 */
public class Main {
    public static void main(String[] args) {
        //创建 Map<String, List<Foo>>类型对象
        Map<String, List<Foo>> map = new HashMap<String, List<Foo>>();
        //创建Foo对象
        Foo f1 = new Foo("A001","测试1");
        Foo f2 = new Foo("A002","测试2");
        Foo f3 = new Foo("A003","测试3");
        Foo f4 = new Foo("A002","测试4");
        Foo f5 = new Foo("A002","测试5");
        Foo f6 = new Foo("A001","测试6");

        List<Foo> list1 = new ArrayList<>();
        list1.add(f1);
        list1.add(f4);
        list1.add(f5);

        List<Foo> list2 = new ArrayList<>();
        list2.add(f2);
        list2.add(f6);

        List<Foo> list3 = new ArrayList<>();
        list3.add(f3);
        //添加到map集合
        map.put("A003",list3);
        map.put("A001",list1);
        map.put("A002",list2);
        //遍历
        Set<Map.Entry<String,List<Foo>>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,List<Foo>>> iterator = entrySet.iterator();
        for (;iterator.hasNext();){
            System.out.println(iterator.next().getKey()+"........"+iterator.next().getValue());
        }

    }
}