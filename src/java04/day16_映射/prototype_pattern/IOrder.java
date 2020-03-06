package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/5/2019 - 9:38 PM
 */
public interface IOrder {
    int getOrderProductNum();
    void setOrderProductNum(int productNum);
    //克隆订单

    public IOrder cloneOrder();
}
