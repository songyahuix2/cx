package java04.day16_映射.annotation;

/**
 * @author shkstart
 * @date 8/5/2019 - 4:24 PM
 */
public class AnnotationTest{
    @MyMessage(name = "A",desc="静态变量")
    private static int a;
    @MyMessage(name = "test",desc="类中的普通方法test")
    public void test()
    {
        System.out.println("sfafaf");
    }
}
