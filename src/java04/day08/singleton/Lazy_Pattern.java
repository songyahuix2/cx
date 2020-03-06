package java04.day08.singleton;

/**
 * @author shkstart
 * @date 7/24/2019 - 4:33 PM
 */
public class Lazy_Pattern {
    private Lazy_Pattern(){}
//  懒汉模式：
//  private static Lazy_Pattern lp = new Lazy_Pattern();
//    public static Lazy_Pattern getInstance(){
//        return lp;
//    }

    //饿汉模式：
    private static Lazy_Pattern lp = null;
    public static synchronized Lazy_Pattern getInstance(){
        if(lp == null){
            lp = new Lazy_Pattern();
        }
        return lp;
    }

    public static void main(String[] args) {
        //懒汉
        // Lazy_Pattern lazy_pattern = Lazy_Pattern.getInstance();
        //饿汉
        Lazy_Pattern lazy_pattern1 = Lazy_Pattern.getInstance();
    }
}
