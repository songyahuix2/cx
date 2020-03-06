package Java03.unit8.work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author shkstart
 * @date 7/22/2019 - 7:42 PM
 */
public class Demo_4 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        arrayList.add("test");
        Demo_4 demo_4 = new Demo_4();
        arrayList.add(demo_4);
        arrayList.add(8888);

        for(ListIterator li =arrayList.listIterator();li.hasNext();){
            System.out.println(li.next());
        }

        linkedList.addAll(arrayList);
        System.out.println(linkedList.toString());
        linkedList.removeAll(arrayList);
        System.out.println(linkedList.toString());


    }
}
