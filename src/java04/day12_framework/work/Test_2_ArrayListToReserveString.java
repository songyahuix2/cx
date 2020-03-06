package java04.day12_framework.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @date 7/30/2019 - 5:48 PM
 */
public class Test_2_ArrayListToReserveString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test_1");
        list.add("test_2");
        list.add("test_3");
        list.add("test_4");
        list.add("test_5");
        System.out.println(list.get(2));
        list.remove(1);
        list.set(2,"run");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+'\t');
        }
        for (String str:list
             ) {
            System.out.print(str+" ");
        }
    }
}
