package java04.day12_framework.work;

import java.util.Objects;

/**
 * @author shkstart
 * @date 7/30/2019 - 6:44 PM
 */
class Product implements Comparable<Product>{
    private String proID;
    private String proName;
    private String proPrice;
    private String proState;

    public Product(String proID, String proName, String proPrice, String proState) {
        this.proID = proID;
        this.proName = proName;
        this.proPrice = proPrice;
        this.proState = proState;
    }

    @Override
    public int compareTo(Product o) {

        if(this.proID.equals(o.proID)==false){
            return this.proID.compareTo(o.proID);
        }
        if(this.proName.equals(o.proName)==false){
            return this.proName.compareTo(o.proName);
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(proID, product.proID) &&
                Objects.equals(proName, product.proName) &&
                Objects.equals(proPrice, product.proPrice) &&
                Objects.equals(proState, product.proState);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(proID)*3;
    }

    public String getProID() {
        return proID;
    }

    public void setProID(String proID) {
        this.proID = proID;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "proID='" + proID + '\'' +
                ", proName='" + proName + '\'' +
                ", proPrice='" + proPrice + '\'' +
                ", proState='" + proState + '\'' +
                '}';
    }
}
