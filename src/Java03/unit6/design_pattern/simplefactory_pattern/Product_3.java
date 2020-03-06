package Java03.unit6.design_pattern.simplefactory_pattern;

/**
 * @author shkstart
 * @date 7/18/2019 - 9:39 AM
 */
public class Product_3 implements Iproduct{
    @Override
    public Iproduct product() {
        System.out.println("产品三");


        return new Product_3();
    }
}
