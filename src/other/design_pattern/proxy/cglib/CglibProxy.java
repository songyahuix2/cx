package other.design_pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.omg.PortableInterceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @author shkstart
 * @date 2019/10/28 - 21:47
 */
public class CglibProxy implements MethodInterceptor {

    private Object target;
    public CglibProxy(Object target){
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
        if(method.getName().equals("add")||method.getName().equals("update")|method.getName().equals("delete")){
            new LogUtil().addLog();
        }
        return returnValue;
    }
}
