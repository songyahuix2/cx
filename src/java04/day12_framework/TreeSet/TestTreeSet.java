package java04.day12_framework.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author shkstart
 * @date 7/30/2019 - 10:25 AM
 */
public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> intSet = new TreeSet<>();
        intSet.add(45);
        intSet.add(46);
        intSet.add(47);
        intSet.add(47);
        intSet.add(49);
        System.out.println(intSet);
        Iterator<Integer> iterator = intSet.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            System.out.println(i);
        }
    }
}
