package java04.day16_映射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author shkstart
 * @date 8/5/2019 - 1:11 PM
 */
public class Exercise {
    public static void main(String[] args) {
        Class<Student> clazz1 = Student.class;
        Class<Student> clazz2 = Student.class;
        String clazzName1 = clazz1.getName();
        String clazzName2 = clazz2.getName();
        System.out.println(clazzName1);
        System.out.println(clazzName2);
        Method[] methods = clazz1.getDeclaredMethods();
        for(Method m:methods){
            System.out.println("方法名："+m.getName()+"修饰符"+m.getModifiers()+"参数列表"+m.getParameterTypes()+"返回值"+m.getReturnType());
        }
        Field[] field = clazz1.getDeclaredFields();
        for (Field f:field) {
           Class<?> clazz = f.getDeclaringClass();
           clazz.getName();
           clazz.getDeclaredMethods();
           clazz.getModifiers();
           clazz.toString();
        }
        Constructor[] constructors = clazz1.getDeclaredConstructors();
        for (Constructor c:constructors) {
            System.out.println(c.getModifiers()+":");
        }
    }
}
