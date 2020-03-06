package Java03.unit5.singleton_pattern;

/**
 * @author shkstart
 * @date 7/17/2019 - 2:54 PM
 */

//懒汉模式
public class Instance_lazy_Demo {
private static Instance_lazy_Demo lazyDemo = null;
    private Instance_lazy_Demo(){

}
public static Instance_lazy_Demo getInstance(){
    if( null == lazyDemo){
        System.out.println("sccessful!");
       lazyDemo = new Instance_lazy_Demo();
        return lazyDemo;

    }
    else{
        System.out.println("defeat");
    return null;
    }
}
}
