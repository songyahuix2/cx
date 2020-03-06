package other.design_pattern.factory.general;
/**
 * @author shkstart
 * @date 2019/10/26 - 9:09
 */

interface Factory{
    Fruit createFruit();
}
class AppleFactory implements Factory {
    public Fruit createFruit(){
        return new Apple();
    }
}
class PearFactory implements Factory {
    public Fruit createFruit(){
        return new Pear();
    }
}
interface Fruit{
    void whatIm();
}
class Pear implements Fruit{
   public void whatIm(){
        System.out.println("pear");
    }
}
class Apple implements Fruit{
    public void whatIm(){
        System.out.println("apple");
    }
}
public class Factory_Pattern {
    public static void main(String[] args) {
//    选择工厂
    Factory factory = new AppleFactory();
    factory.createFruit().whatIm();
    }

}
