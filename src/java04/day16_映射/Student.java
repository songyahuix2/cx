package java04.day16_映射;

/**
 * @author shkstart
 * @date 8/5/2019 - 12:49 PM
 */
import java.io.IOException;

/**
 * 该类用于描述学生信息
 *   学生共有的属性与行为
 *
 * class 类名{
 *     //属性（成员变量）
 *     //行为（成员方法） *
 * }
 *
 * 低耦合？？？？？？？？？？？？？？
 * 可维护性 比较差
 *
 *
 * 存在的问题：
 * （1）从耦合性与维护性：学生的信息 只归 Student类维护
 * （2）从安全性： 学生的元信息 不被暴露出来
 *
 * 解决：
 * 访问权限
 *  public ： 公共的，所有的类都能访问
 *  private : 私有的， 只有本类能访问
 *
 *  set 方法 给属性赋值
 *
 */
public class Student {
    /**
     * 学生姓名
     */
    private String stuName;   // 成员变量
    /**
     * 学生手机号
     */
    private long stuTelno;
    /**
     * 学生年龄
     */
    private int stuAge;
    /**
     * 学生专业
     */
    private String stuMajor;



    //给学生姓名赋值
    //this 当前对象

    public void setStuName(String stuName){ //形式参数（形参）
        this.stuName = stuName;
    }


    //给学生年龄赋值
    public void setStuAge(int stuAge){
        this.stuAge = stuAge;
    }
    //给学生手机号赋值
    public void setStuTelno(long stuTelno){
        this.stuTelno = stuTelno;
    }


    //给学生专业赋值
    public final  void setStuMajor(String stuMajor){
        this.stuMajor = stuMajor;
    }


    //获得学生的姓名
    public String getStuName(){
        return this.stuName;
    }

    //获得学生的年龄
    public int getStuAge(){
        return this.stuAge;
    }

    //获得学生的专业
    public String getStuMajor(){
        return  this.stuMajor;
    }

    //获得学生的手机号
    public long getStuTelno(){
        return this.stuTelno;
    }

    public final int add(int a,String b,float c) throws IOException {
        return 0;
    }

}
