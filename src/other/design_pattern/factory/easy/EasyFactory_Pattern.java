package other.design_pattern.factory.easy;

/**
 * @author shkstart
 * @date 2019/10/26 - 9:09
 */
public class EasyFactory_Pattern {
    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createFruit("pear");
    }
}
class Factory{
    public Fruit createFruit(String type){
        if(type.equals("apple")){
            return new Apple();
        }
        else if(type.equals("pear")){
            return new Pear();
        }
        else
            return null;
    }
}
interface Fruit {
    void whatIm();
}
class Apple implements Fruit {
    @Override
    public void whatIm() {
        //苹果
        System.out.println("apple");
    }
}
class Pear implements Fruit {
    @Override
    public void whatIm() {
        //梨
        System.out.println("pear");
    }
}
