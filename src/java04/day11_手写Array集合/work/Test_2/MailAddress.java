package java04.day11_手写Array集合.work.Test_2;

import java.util.Objects;

/**
 * @author shkstart
 * @date 7/29/2019 - 6:34 PM
 */
public class MailAddress {
    String name;
    String teLno;
    String street;
    String city;
    String state;
    String country;
    String pincode;
public MailAddress(){

}
    public MailAddress(String name, String teLno, String street, String city, String state, String country, String pincode) {
        this.name = name;
        this.teLno = teLno;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "MailAddress{" +
                "name='" + name + '\'' +
                ", teLno='" + teLno + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MailAddress that = (MailAddress) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(teLno, that.teLno) &&
                Objects.equals(street, that.street) &&
                Objects.equals(city, that.city) &&
                Objects.equals(state, that.state) &&
                Objects.equals(country, that.country) &&
                Objects.equals(pincode, that.pincode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teLno, street, city, state, country, pincode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeLno() {
        return teLno;
    }

    public void setTeLno(String teLno) {
        this.teLno = teLno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
