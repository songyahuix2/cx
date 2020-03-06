package other.design_pattern;

/**
 * @author shkstart
 * @date 2019/10/26 - 9:07
 */
public class A {
    public static void main(String[] args) {
        System.out.println("test");
        A a = new A();
        a.main();
    }
    public void main(){
        System.out.println("test.main");
    }
    public static void test(){
        System.out.println("test");
    }
    public static int test(int i){
        return i;
    }
    public static int main(int i){
        return 2;
    }
}
