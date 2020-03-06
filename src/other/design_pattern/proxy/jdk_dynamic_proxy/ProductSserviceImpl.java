package other.design_pattern.proxy.jdk_dynamic_proxy;

import java04.day17_proxy.jdk_dynamic_proxy.Product;
import java04.day17_proxy.jdk_dynamic_proxy.ProductService;

import java.util.List;

/**
 * @author shkstart
 * @date 8/6/2019 - 11:24 AM
 */
public class ProductSserviceImpl implements ProductService {

    @Override
    public boolean add(Product product) {
        System.out.println("ok");
        return false;
    }

    @Override
    public boolean update(Product product) {
        System.out.println("ok");
        return false;
    }

    @Override
    public boolean delete(Product product) {
        System.out.println("ok");
        return false;
    }

    @Override
    public List<Product> get() {
        System.out.println("ok");
        return null;
    }

    @Override
    public Product getByID() {
        System.out.println("🆗");
        return null;
    }
}
