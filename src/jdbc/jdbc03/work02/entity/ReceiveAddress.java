package jdbc.jdbc03.work02.entity;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:21 PM
 */
/**
 * 收货地址类
 */
public class ReceiveAddress {
    private int addressId;//收件地址id
    private int userId;//用户id --- 参照userInfo类
    private String addressProvince;//省
    private String addressCity;//市
    private String addressArea;//区
    private String addressTown;//镇
    private String addressDetail;//详细地址

    public ReceiveAddress(){}

    public ReceiveAddress(int addressId, int userId, String addressProvince, String addressCity,
                          String addressArea, String addressTown, String addressDetail) {
        this.addressId = addressId;
        this.userId = userId;
        this.addressProvince = addressProvince;
        this.addressCity = addressCity;
        this.addressArea = addressArea;
        this.addressTown = addressTown;
        this.addressDetail = addressDetail;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressTown() {
        return addressTown;
    }

    public void setAddressTown(String addressTown) {
        this.addressTown = addressTown;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    @Override
    public String toString() {
        return "DeliveryAddress{" +
                "addressId=" + addressId +
                ", userId=" + userId +
                ", addressProvince='" + addressProvince + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressArea='" + addressArea + '\'' +
                ", addressTown='" + addressTown + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                '}';
    }
}
