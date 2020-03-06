package jdbc.jdbc03.work02.entity;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:32 PM
 */
public class OrderDetail {
   private int order_id;
   private int pro_id;
   private int quantity;

    public OrderDetail(int order_id, int pro_id, int quantity) {
        this.order_id = order_id;
        this.pro_id = pro_id;
        this.quantity = quantity;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getPro_id() {
        return pro_id;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderDetailServiceImpl{" +
                "order_id=" + order_id +
                ", pro_id=" + pro_id +
                ", quantity=" + quantity +
                '}';
    }
}
