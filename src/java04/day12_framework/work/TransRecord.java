package java04.day12_framework.work;

/**
 * @author shkstart
 * @date 7/30/2019 - 8:20 PM
 */
//定义一个交易记录类
public class TransRecord {
    private String custerNum;
    private String name;
    private String mechanismNum;
    private char gender;
    private String accountNum;
    private String occurTime;
    private String transValue;

    public TransRecord() {

    }

    public TransRecord(String custerNum, String name, String mechanismNum, char gender, String accountNum, String occurTime, String transValue) {
        this.custerNum = custerNum;
        this.name = name;
        this.mechanismNum = mechanismNum;
        this.gender = gender;
        this.accountNum = accountNum;
        this.occurTime = occurTime;
        this.transValue = transValue;
    }

    @Override
    public String toString() {
        return "TransRecord{" +
                "custerNum='" + custerNum + '\'' +
                ", name='" + name + '\'' +
                ", mechanismNum='" + mechanismNum + '\'' +
                ", gender=" + gender +
                ", accountNum='" + accountNum + '\'' +
                ", occurTime=" + occurTime +
                ", transValue='" + transValue + '\'' +
                '}';
    }

    public String getCusterNum() {
        return custerNum;
    }

    public void setCusterNum(String custerNum) {
        this.custerNum = custerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMechanismNum() {
        return mechanismNum;
    }

    public void setMechanismNum(String mechanismNum) {
        this.mechanismNum = mechanismNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(String occurTime) {
        this.occurTime = occurTime;
    }

    public String getTransValue() {
        return transValue;
    }

    public void setTransValue(String transValue) {
        this.transValue = transValue;
    }
}
