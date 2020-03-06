package java04.day17_proxy.jdk_dynamic_proxy;

/**
 * @author shkstart
 * @date 8/6/2019 - 11:20 AM
 */
public class Product {
    private String productID;
    private String productName;
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
