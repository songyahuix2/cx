package java04.day12_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @date 7/31/2019 - 9:11 AM
 */
public class Test{

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tett");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator it  = list.iterator();
while (it.hasNext()){
String str = (String) it.next();
    System.out.println(str);
}
    }
}
