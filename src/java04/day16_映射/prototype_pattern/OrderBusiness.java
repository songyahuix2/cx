package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/6/2019 - 7:15 AM
 */
public class OrderBusiness {
    public void saveOrder(IOrder order){
        while (order.getOrderProductNum()>1000){
        IOrder subOrder = order.cloneOrder();
        subOrder.setOrderProductNum(1000);
        order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("产生的子订单 的信息是：" +subOrder.toString());

        }
        System.out.println("原始订单信息："+order.toString());
    }
}
