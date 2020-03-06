package Java03.unit6.design_pattern.simplefactory_pattern;

/**
 * @author shkstart
 * @date 7/18/2019 - 9:36 AM
 */
public class client {
    public static void main(String[] args) {
        String str = new String();
        str = "aaa";
        String s = "aaa";
        System.out.println(str.equals(s));
        Iproduct iproduct = new Product_3();
        SampleFactory sampleFactory = new SampleFactory(iproduct);
    }
}
