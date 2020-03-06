package java04.day12_framework.work;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shkstart
 * @date 7/30/2019 - 6:44 PM
 */
public class Test_4_HashSetToReserveProduct {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<Product>();
        ArrayList<Product> arrayList = new ArrayList<>();
set.add(new Product("1001","牛奶","5","澳大利亚"));

        //添加属性值相同的产品元素会报错
        set.add(new Product("1001","牛奶","5","澳大利亚"));
       //迭代
        Iterator<Product> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(set.size());

        //找出价钱大于等于三百的商品
        for (Product pro:set
             ) {
            if(Double.parseDouble(pro.getProPrice())>=300){
                arrayList.add(pro);
            }
        }
    }
}
