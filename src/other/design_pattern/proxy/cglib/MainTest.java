package other.design_pattern.proxy.cglib;


import java04.day17_proxy.jdk_dynamic_proxy.Product;

/**
 * @author shkstart
 * @date 2019/10/28 - 22:08
 */
public class MainTest {
    public static void main(String[] args) {
        ProductService service = (ProductService)new CglibProxy(new ProductService()).getProxyInstance();
        service.add(new Product());
    }
}
