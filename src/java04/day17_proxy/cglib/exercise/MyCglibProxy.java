package java04.day17_proxy.cglib.exercise;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCglibProxy implements MethodInterceptor {

    private Object target;
    public MyCglibProxy(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object returnValue = method.invoke(target,objects);
        if(method.getName().equals("add") || method.getName().equals("update")||method.getName().equals("delete")){
            new LoginUtil().addLog();
        }
        return returnValue;
    }
}
