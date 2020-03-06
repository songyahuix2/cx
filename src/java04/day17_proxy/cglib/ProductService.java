package java04.day17_proxy.cglib;

import java04.day17_proxy.jdk_dynamic_proxy.Product;

import java.util.List;

/**
 * @author shkstart
 * @date 8/6/2019 - 3:35 PM
 */
public class ProductService {
    public boolean add(java04.day17_proxy.jdk_dynamic_proxy.Product product) {
        System.out.println("ok");
        return false;
    }

    
    public boolean update(java04.day17_proxy.jdk_dynamic_proxy.Product product) {
        System.out.println("ok");
        return false;
    }

    
    public boolean delete(java04.day17_proxy.jdk_dynamic_proxy.Product product) {
        System.out.println("ok");
        return false;
    }

    
    public List<java04.day17_proxy.jdk_dynamic_proxy.Product> get() {
        System.out.println("ok");
        return null;
    }

    
    public Product getByID() {
        System.out.println("ok");
        return null;
    }
}
