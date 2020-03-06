package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/5/2019 - 9:56 PM
 */
public class PersonalOrder extends AbstractOrder{
    /**
     * 个人客户姓名
     */
    private String customerName;
    public String getcustomerName(){
        return customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                '}';
    }

    public IOrder cloneOrder(){
     PersonalOrder cloneObject = new PersonalOrder();
        cloneObject.setcustomerName(this.getcustomerName());
        cloneObject.setOrderProductNum(this.getOrderProductNum());
        cloneObject.setProductID(this.getProductID());
     return  cloneObject;
    }
}
