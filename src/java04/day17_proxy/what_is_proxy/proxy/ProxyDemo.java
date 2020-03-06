package java04.day17_proxy.what_is_proxy.proxy;

//1.服务提供商
interface CarFactory{
    void saleCarName(String color);
}

class TOYOTAFactory implements CarFactory {
    @Override
    public void saleCarName(String color) {
        System.out.println("向客户提供一台丰田轿车");
    }
}

//2.销售商为客户提供厂商的汽车，并提供前置增强实现（量身选型），后置增强实现（三年保修，五年免检）
class Proxy_2_car implements CarFactory{
    private final CarFactory factory;

    public Proxy_2_car(CarFactory factory) {
        super();
        this.factory = factory;
    }

    @Override
    public void saleCarName(String color) {
        //前置实现
        System.out.println("量身定做："+color);
        //
        factory.saleCarName(color);
        //后置实现
        System.out.println("保修+免检");
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        CarFactory factory = new TOYOTAFactory();
        Proxy_2_car proxy_2_car = new Proxy_2_car(factory);
        proxy_2_car.saleCarName("银灰");
    }
}
