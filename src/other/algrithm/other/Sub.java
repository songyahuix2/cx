package other.algrithm.other;

/**
 * @author shkstart
 * @date 2019/10/25 - 15:23
 */

class Super {
        int i = 10;


        Super () {
        print();

        i = 20;
        }
        void print() {
        System.out.println("Super ==> " + i);
        }
        }

public class Sub extends Super {
    int i = 30;
    Sub() {
        print1(40);
        i = 40;
    }
    void print1(int i1) {
        System.out.println("SubClass ==> " + i);
    }
    public static void main(String[] args) {
        System.out.println(new Sub().i);
//        测试下面的结果：
//        A、A==b B、A==c C、c==d D、A.equals(b) E、A.equals(c) F、c.equals(d)
        String a ="test";
        String b ="test";
        System.out.println(Sub.class);
        String c = new String("test");
        String d = new String("test");
        System.out.println(a==b);
        System.out.println(a.toString());
        System.out.println(a==c);
        System.out.println(c==d);
        System.out.println(c.toString());
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(c.equals(d));

    }
}
