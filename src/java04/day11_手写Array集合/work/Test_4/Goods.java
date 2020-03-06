package java04.day11_手写Array集合.work.Test_4;

import java.util.Objects;

/**
 * @author shkstart
 * @date 7/29/2019 - 9:13 PM
 */
public class Goods {
    private String goodsID;
    private String goodsName;
    private String price;

    public Goods(String goodsID, String goodsName, String price) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.price = price;
    }

    public String getGoodsID() {
        return goodsID;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsID='" + goodsID + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodsID, goods.goodsID) &&
                Objects.equals(goodsName, goods.goodsName) &&
                Objects.equals(price, goods.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsID, goodsName, price);
    }
}
