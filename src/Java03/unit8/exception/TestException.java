package Java03.unit8.exception;

/**
 * @author shkstart
 * @date 7/25/2019 - 4:01 PM
 */
public class TestException {
    public static void main(String[] args) {
        Test t = new Test();
        String str = "ttt";
         String str2 = "ttt";
        System.out.println(str2.equals(str));
        try {
            t.test(5);
        } catch (AutoException e) {//AutoException e =  new AutoException ();
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
