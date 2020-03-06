package other.design_pattern.proxy.jdk_dynamic_proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author shkstart
 * @date 2019/10/26 - 20:18
 */
public class Proxy_Pattern implements InvocationHandler {
    private Object target;
    public Proxy_Pattern(Object target){
        this.target=target;
    }
    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable{
        Object returnValue = method.invoke(target,args);
        if(method.getName().equals("add")||method.getName().equals("update")||method.getName().equals("delete")){
            new LogUtil().addLog();
        }
        return returnValue;
    }
}

