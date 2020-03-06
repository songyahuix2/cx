package Java03.unit4;

/**
 * @author shkstart
 * @date 7/16/2019 - 7:58 PM
 */

/**
 * C -> B -> arr 子孙三层类继承关系的特性：
 * 1.C 也继承 arr 的成员
 * 2.由于单继承，故C 不直接继承上帝类，而是C -> B -> arr -> Object
 * 3.创建C类的实例时，会递归调用　B 和　C　的构造器，以创建　B　和　C　的对象来实现　C　类对象的继承功能
 * ４．若A和B中新创建了有参的构造函数，则此时 3 中叙述失效，需要手动创建一个新的无参构造器。
 * 因为 3 仅支持 父类的无参构造器（实质是花费最小代价来创建父类对象）
 * 5.继承的成员不能private，且不能继承父类构造器
 */
class A {
    public A(){
        System.out.println("A类构造器被调用");
    }
    public void test(){
        System.out.println("zubei");
    }
    public void test_1(){
        System.out.println("zubei");
    }
}
class B extends A{
    public B(){
        System.out.println("B类构造器被调用");
    }
    @Override
    public void test() {
        System.out.println("zilei");
    }
}
public class 多继承 extends B{
    @Override
    public void test() {
        super.test();
    }

    @Override
    public void test_1() {
        super.test_1();
    }

    public static void main(String[] args) {
        多继承 a = new 多继承();
        a.test();
        a.test_1();
    }
}