package java04.day16_映射;
import java.lang.reflect.Method;
/**
 * @author shkstart
 * @date 8/5/2019 - 12:50 PM
 */
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) {
        //只需要提供类全名（com.chixing.day16.reflect.Student）,就可以获得该类的所有结构
        //在JVM中的Student类
        Class<Student>  clazz =  java04.day16_映射.Student.class;
        String className =  clazz.getName();
        System.out.println(className);
        Method[] methods =  clazz.getDeclaredMethods();
        for(Method method:methods){
            String methodName = method.getName();
            Class returnType =  method.getReturnType();
            int modifiers =  method.getModifiers();
            System.out.print("方法名：" + methodName+ ", 返回值类型：" + returnType+ ",修饰符：" + modifiers+",");
            Class[] paramTypes = method.getParameterTypes();
            for(Class c: paramTypes){
                System.out.print("形式参数是：" + c.getName());
            }
            System.out.println();
          
            //调用方法
         /*
           double b1 = acc1.存款(10);
           double b2 = acc2.存款(1000000);

           double b1 = 存款方法.invoke(  acc1,10 )
           double b2 = 存款方法.invoke(  acc2,1000000 )
*/


        }

    }
}

