package java04.day07;

/**
 * @author shkstart
 * @date 7/24/2019 - 9:07 AM
 */
public class 静态块 {

    static int a =10;
    private static double d =initStaticVar();


    static {

        System.out.println(d+5);
    }
    private static double initStaticVar() {
        System.out.println("当前d的值："+d);
        return 1;
    }

    public static void main(String[] args) {
        静态块 j1 = new 静态块();

      /*  String str1 = "test";
        String str2 = new String("test");
        System.out.println(str1.equals(str2));*/
    }
}
