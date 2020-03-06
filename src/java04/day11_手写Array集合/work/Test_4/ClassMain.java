package java04.day11_手写Array集合.work.Test_4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shkstart
 * @date 7/29/2019 - 9:13 PM
 */
public class ClassMain {
    public static void main(String[] args) {
        ArrayList<Goods> arrayList = new ArrayList<>();
        arrayList.add(new Goods("622848","鹈鹕到","200"));
        arrayList.add(new Goods("622849","小泡泡","100"));
        arrayList.add(new Goods("622850","大脑复","250"));
        arrayList.add(new Goods("622851","小狮子","50"));
        arrayList.add(new Goods("622852","傻刨子","50"));
        Goods good = new Goods("622853","板凳","70");
arrayList.remove(1);
arrayList.get(2);
Iterator iterator = arrayList.iterator();
arrayList.set(1,good);
    }
}
