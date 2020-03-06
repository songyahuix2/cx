package java04.day17_proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * @author shkstart
 * @date 8/6/2019 - 11:30 AM
 */
public class MyProxy implements InvocationHandler {
    private Object target;
    public MyProxy(Object target){
        this.target=target;
    }
    public Object getProxy(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{
        Object returnValue = method.invoke(target,args);
        if(method.getName().equals("add")||method.getName().equals("update")||method.getName().equals("delete")){
        new LogUtil().addLog();
        }
    return returnValue;
    }
}
