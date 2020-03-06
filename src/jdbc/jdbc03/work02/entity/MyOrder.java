package jdbc.jdbc03.work02.entity;

import java.util.Date;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:28 PM
 */
public class MyOrder {

    private int myorderId;//订单id
    private Date myorderTime;//下单时间
    private int userId;//用户id
    private int addressId;//收件地址id
    public MyOrder(){}

    public MyOrder(int myorderId, Date myorderTime, int userId, int addressId) {
        this.myorderId = myorderId;
        this.myorderTime = myorderTime;
        this.userId = userId;
        this.addressId = addressId;
    }

    public int getMyorderId() {
        return myorderId;
    }

    public void setMyorderId(int myorderId) {
        this.myorderId = myorderId;
    }

    public Date getMyorderTime() {
        return myorderTime;
    }

    public void setMyorderTime(Date myorderTime) {
        this.myorderTime = myorderTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Myorder{" +
                "myorderId=" + myorderId +
                ", myorderTime=" + myorderTime +
                ", userId=" + userId +
                ", addressId=" + addressId +
                '}';
    }
}
