package java04.day17_proxy.cglib;

import Java03.unit6.design_pattern.simplefactory_pattern.Iproduct;
import java04.day17_proxy.jdk_dynamic_proxy.Product;

/**
 * @author shkstart
 * @date 8/6/2019 - 3:47 PM
 */
public class CglibTest {
    //为了实现商品的业务操作和日期操作-------->增强实现
    public static void main(String[] args) {
        ProductService productService = (ProductService) new MyCglibProxy(new ProductService()).getProxyInstance();
        productService.add(new Product());
        productService.delete(new Product());
        productService.get();
        System.out.println(System.getProperty("file.encoding"));
    }
}
