package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/5/2019 - 9:19 PM
 */
public class Main {
    public static void main(String[] args) {
        PersonalOrder  personalOrder = new PersonalOrder();
        personalOrder.setcustomerName("Tom");
        personalOrder.setProductID("43u4i33dfdf884");
        personalOrder.setOrderProductNum(2900);


        IOrder order = (IOrder) personalOrder;
        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(order);


    }

}
