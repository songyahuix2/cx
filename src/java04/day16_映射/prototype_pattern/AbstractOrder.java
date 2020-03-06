package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/5/2019 - 9:22 PM
 */
public abstract class AbstractOrder implements IOrder {
    private String productID;//产品编号
    private int orderProductNum;
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }
    public abstract IOrder cloneOrder();
}
