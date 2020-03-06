package java04.day12_framework.work;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author shkstart
 * @date 7/30/2019 - 7:28 PM
 */
class Compara implements Comparator<Product>{
   public int compare(Product p1,Product p2) {
       if (Integer.parseInt(p1.getProPrice()) != Integer.parseInt(p2.getProPrice())) {
           return Integer.parseInt(p1.getProPrice()) - Integer.parseInt(p2.getProPrice());
       }
       if (p1.getProName().equals(p2.getProName()) != true) {
           return p1.getProName().compareTo(p2.getProName());
       }
       if(p1.getProID().equals(p2.getProID())!=true){
           return p1.getProID().compareTo(p2.getProID());
       }
       return 0;
   }
}
public class Test_5_TreeSetToReserveProduct {
    public static void main(String[] args) {
        Set<Product> set = new TreeSet<>(new Compara());
        set.add(new Product("1001","牛奶","15","澳大利亚"));
        set.add(new Product("1002","饮料","25","中国"));
        set.add(new Product("1003","咖啡","5","美国"));
        set.add(new Product("1004","奶粉","35","日本"));
        set.add(new Product("1005","茶","25","中国"));
        set.add(new Product("1001","牛奶","55","澳大利亚"));
        set.add(new Product("1007","八宝粥","105","中国"));
    Iterator<Product> it = set.iterator();
    while (it.hasNext()){
        System.out.println(it.next());
    }

    }


}
