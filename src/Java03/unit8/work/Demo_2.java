package Java03.unit8.work;

/**
 * @author shkstart
 * @date 7/22/2019 - 6:51 PM
 */

public class Demo_2 {
    private int a = 10;
    private  static  int b =99;
    class Inner{
        int a = 20;
        void test(){
            int a = 30;
            System.out.println(a);
        }
    }
    //静态内部类无法调用外部类的实例成员变量，只可以调用静态变量
    static  class InnerStatic{
        static int c =15;
        int b = 16;
        void test(){
        //调用的变量名相同时，就近原则，调用最小作用域的变量，如下面的
        //b是该内部类中的变量b，而不是外部类的变量b
            System.out.println(b);
        }


    }
    public static void main(String[] args) {
        //创建非静态内部类
        new Demo_2().new Inner().test();
        //创建静态内部类
        new Demo_2.InnerStatic().test();
    }
}
