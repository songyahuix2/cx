package Java03.unit6.design_pattern.simplefactory_pattern;

/**
 * @author shkstart
 * @date 7/18/2019 - 9:38 AM
 */
public class Product_1 implements Iproduct{
    @Override
    public Iproduct product() {
        System.out.println("产品1");
        return new Product_1();
    }
}
