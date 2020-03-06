package java04.day17_proxy.what_is_proxy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//目标对象
interface PhoneFactory{
    void salephoneName();
}
interface PlainFactory{
    void salePlainName();
}
class AirBusFactory implements PlainFactory{
    private String plainName;
    public AirBusFactory(String plainName){
        this.plainName = plainName;
    }
    @Override
    public void salePlainName() {
        System.out.println("为客户提供新型客机："+plainName);
    }
}
class HuaweiPhoneFactory implements PhoneFactory{
    private String phoneName;
    public HuaweiPhoneFactory(String phoneName){
        this.phoneName = phoneName;
    }
    @Override
    public void salephoneName() {
        System.out.println("为客户提供智能手机："+phoneName);
    }
}

//jdk动态代理：
class DynamicProxy implements InvocationHandler{
    private Object target;
    public DynamicProxy(Object target){
        this.target=target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强实现：量身定做");
        Object o = method.invoke(target,args);
        return o;
    }
}
public class JDK_Dynamic_ProxyDemo {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = (PhoneFactory) new DynamicProxy(new HuaweiPhoneFactory("华为mate30 pro")).getProxy();
        PlainFactory plainFactory = (PlainFactory) new DynamicProxy(new AirBusFactory("A-A380")).getProxy();
        phoneFactory.salephoneName();
        plainFactory.salePlainName();
    }
}
