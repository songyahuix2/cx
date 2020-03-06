package Java03.unit5.singleton_pattern;

/**
 * @author shkstart
 * @date 7/18/2019 - 12:48 PM
 */
public class MainClass {
    public static void main(String[] args) {
        //懒汉式测试
        Instance_lazy_Demo lazyDemo1 = Instance_lazy_Demo.getInstance();
        Instance_lazy_Demo lazyDemo2 = Instance_lazy_Demo.getInstance();
        //饿汉式测试
        Instance_Hunger_Demo hungerDemo = Instance_Hunger_Demo.getInstance();
        String str = "string";

    }
}
