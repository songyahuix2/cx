package java04.day17_proxy.jdk_dynamic_proxy;

/**
 * @author shkstart
 * @date 8/6/2019 - 12:28 PM
 */
public class ProxyTest {
public static void main(String[] args){
    Product product = new Product();
   ProductService service = (ProductService)  new MyProxy(new ProductSserviceImpl()).getProxy();
    service.add(product);
    service.get(); //添加商品
}
}
