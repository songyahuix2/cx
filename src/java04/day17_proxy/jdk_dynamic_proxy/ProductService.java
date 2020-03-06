package java04.day17_proxy.jdk_dynamic_proxy;

import java.util.List;

/**
 * @author shkstart
 * @date 8/6/2019 - 11:22 AM
 */
public interface ProductService {
    public boolean add(Product product);
    public boolean update(Product product);
    public boolean delete(Product product);
    public List<Product> get();
    public Product getByID();
}
