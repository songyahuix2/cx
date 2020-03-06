package Java03.unit8.framework;

import java.util.*;

/**
 * @author shkstart
 * @date 7/22/2019 - 4:36 PM
 */
class student{
    public void test(){
        System.out.println("test1");
    }
}
public class Demo01_Collection {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        Collection coll2 = new LinkedList();

        show(coll,coll2);
        Iterator iterator =  coll2.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for(Iterator it3 = coll.iterator();it3.hasNext();){
            System.out.println(it3.next());
        }
    }

    private static void show(Collection coll, Collection coll2) {
        student stu = new student();
        coll.add(stu);
        coll.add("abce");
        coll.add("test");
        coll.add(1);
        coll.add('t');
        coll.add(stu);
        coll2.add("sssss");
        coll2.addAll(coll);

        System.out.println(coll.toString());
        System.out.println(coll2.toString());
        coll2.removeAll(coll);
        System.out.println("--------------------");
        System.out.println(Arrays.toString( coll2.toArray()));
    }
}
