package java04.day12_framework.work;

import java.util.TreeSet;

/**
 * @author shkstart
 * @date 7/30/2019 - 8:01 PM
 */

public class Test_6_PrintExpense {
    public static void main(String[] args) {
        TreeSet<Product> set = new TreeSet<>();
        Product p1 = new Product("宝洁","洗洁精","3.4","中国");
        Product p2 = new Product("联合利华","肥皂","4.5","中国");
        Product p3 = new Product("宝洁","毛巾","14.5","中国");
        Product p4 = new Product("宝洁","洗手粉","18.5","中国");
        Product p5 = new Product("洁利","洗面奶","26.0","中国");
        Product p6 = new Product("好迪","洗发水","27.5","中国");
        Product p7 = new Product("宝洁","牙膏","32.5","中国");
        Product p8 = new Product("多芬","沐浴露","38.5","中国");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        for (Product pro:set
             ) {

        System.out.println(pro);
        }
    }
}
