package java04.day16_映射.prototype_pattern;

/**
 * @author shkstart
 * @date 8/6/2019 - 7:19 AM
 */
public class EnterpriseOrder extends AbstractOrder{
    private String enterpriseName;
private String enterpriseName(){
    return enterpriseName();
}
public void setEnterpriseName(String enterpriseName){
    this.enterpriseName= enterpriseName;
}

    public String getEnterpriseName() {
        return enterpriseName;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                '}';
    }

    /**
     *
     * @return
     */
    @Override
    public IOrder cloneOrder() {
        EnterpriseOrder cloneObject = new EnterpriseOrder();
        cloneObject.setEnterpriseName(this.getEnterpriseName());
        cloneObject.setOrderProductNum(this.getOrderProductNum());
        cloneObject.setProductID(this.getProductID());
        return cloneObject;
    }
}
