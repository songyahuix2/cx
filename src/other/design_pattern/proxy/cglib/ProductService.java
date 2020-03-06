package other.design_pattern.proxy.cglib;

import java04.day17_proxy.jdk_dynamic_proxy.Product;

import java.util.List;

/**
 * @author shkstart
 * @date 8/6/2019 - 3:35 PM
 */
public class ProductService {
    public boolean add(Product product) {
        System.out.println("ok");
        return false;
    }


    public boolean update(Product product) {
        System.out.println("ok");
        return false;
    }


    public boolean delete(Product product) {
        System.out.println("ok");
        return false;
    }


    public List<Product> get() {
        System.out.println("ok");
        return null;
    }

    
    public Product getByID() {
        System.out.println("ok");
        return null;
    }
}
