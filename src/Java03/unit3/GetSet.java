package Java03.unit3;
/*
1.pojo的功能：
private 所修饰内容只能在当前类中访问，
因此通过在其他类的方法中调用GetXXX（）和SetXXX()
来设置私有类中的属性值。
2.pojo使用方法：
alt+insert --> get & set
* */
/**
 * @author shkstart
 * @date 7/15/2019 - 4:00 PM
 */
public class GetSet {
    private String name;
    private double boold;

    public String getName() {
//        作用域中无name形参
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBoold() {
        return boold;
    }

    public void setBoold(double boold) {
        this.boold = boold;
    }
}


