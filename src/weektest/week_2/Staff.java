package weektest.week_2;

import java.util.Date;

/**
 * @author shkstart
 * @date 8/8/2019 - 1:29 PM
 */
public class Staff {
    private int StaffNum;
    private String name;
    private int gander;
    private Date date;
    private String depart;
    private float money;

    public Staff(int staffNum, String name, int gander, Date date, String depart, float money) {
        StaffNum = staffNum;
        this.name = name;
        this.gander = gander;
        this.date = date;
        this.depart = depart;
        this.money = money;
    }

    public int getStaffNum() {
        return StaffNum;
    }

    public void setStaffNum(int staffNum) {
        StaffNum = staffNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGander() {
        return gander;
    }

    public void setGander(int gander) {
        this.gander = gander;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "StaffNum=" + StaffNum +
                ", name='" + name + '\'' +
                ", gander=" + gander +
                ", date=" + date +
                ", depart='" + depart + '\'' +
                ", money=" + money +
                '}';
    }
}
