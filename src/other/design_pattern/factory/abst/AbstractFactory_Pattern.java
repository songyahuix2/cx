package other.design_pattern.factory.abst;

/**
 * @author shkstart
 * @date 2019/10/26 - 9:10
 */
public class AbstractFactory_Pattern {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new XiaoMiFactory();
        phoneFactory.getCpu().run();
        phoneFactory.getScreen().size();
    }
}

interface PhoneFactory{
    Cpu getCpu();
    Screen getScreen();
}
class XiaoMiFactory implements PhoneFactory{

    @Override
    public Cpu getCpu() {
        return new Cpu.Cpu825();
    }

    @Override
    public Screen getScreen() {
        return new Screen.Screen_6();
    }
}
interface Cpu{
    void run();
    class Cpu650 implements Cpu{
        public void run(){
            System.out.println("高通650");
        }
    }
    class Cpu825 implements Cpu{
        public void run(){
            System.out.println("高通825");
        }
    }
}
interface Screen{
    void size();
    class Screen_5 implements Screen{
        public void size(){
            System.out.println("5寸");
        }
    }
    class Screen_6 implements Screen{
        public void size(){
            System.out.println("6寸");
        }
    }
}

