package java04.day12_framework.work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @date 7/30/2019 - 6:12 PM
 */

public class Test_3_ArrayListToReserveProducts {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("1001","牛奶","5￥","澳大利亚"));
        list.add(new Product("1002","饮料","5￥","中国"));
        list.add(new Product("1003","咖啡","5￥","美国"));
        list.add(new Product("1004","奶粉","5￥","日本"));
        list.add(new Product("1005","茶","5￥","中国"));
        Product pro1 = list.get(3-1);
        list.remove(2-1);
        pro1.setProPrice(String.valueOf(Double.valueOf(pro1.getProPrice())*1.5));
        Iterator<Product> it  = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (Product pro: list
             ) {
            System.out.println(pro.toString());
        }
    }
}
