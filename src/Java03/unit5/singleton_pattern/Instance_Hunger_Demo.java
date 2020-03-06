package Java03.unit5.singleton_pattern;

/**
 * @author shkstart
 * @date 7/18/2019 - 1:10 PM
 */
public class Instance_Hunger_Demo {
    private static Instance_Hunger_Demo hungerDemo = new Instance_Hunger_Demo();
    private Instance_Hunger_Demo(){

    }
    public static Instance_Hunger_Demo getInstance(){
        System.out.println("successful!");
        return hungerDemo;
    }
}
