package Java03.unit4;

/**
 * @author shkstart
 * @date 7/17/2019 - 1:29 PM
 */

/**
 * has A:组合方式
 * 指一个类中有另一个类的实例，以下面演示的代码为例：
 */
class Demo {
    public void test() {
        System.out.println("Test!");
    }
}

public class Has_a {
    //Has_a类声明了一个Demo类的引用
    public Demo demo;

    public void test_1(Demo demo) {
        this.demo = demo;
    }
    public static void main(String[] args) {
        //在主函数中同时创建Has_a和Demo的实例
        Demo demo = new Demo();
        Has_a has_a = new Has_a();
        //调用test_1(Demo demo);
        has_a.test_1(demo);
        has_a.demo.test();

    }
}
