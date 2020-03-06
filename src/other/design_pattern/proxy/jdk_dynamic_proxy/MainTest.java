package other.design_pattern.proxy.jdk_dynamic_proxy;

//import java04.day17_proxy.jdk_dynamic_proxy.Product;
//import java04.day17_proxy.jdk_dynamic_proxy.ProductSserviceImpl;

import java04.day17_proxy.jdk_dynamic_proxy.Product;

/**
 * @author shkstart
 * @date 2019/10/28 - 21:48
 */
public class MainTest {
    public static void main(String[] args) {
        Product product = new Product();
        ProductService productService = (ProductService) new Proxy_Pattern(new ProductSserviceImpl()).getProxy();
        productService.add(product);
    }
}
