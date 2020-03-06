package java04.day16_映射.annotation;

import Java03.unit8.exception.Test;

import java.lang.annotation.Annotation;

/**
 * @author shkstart
 * @date 8/5/2019 - 4:40 PM
 */
public class ParseAnnotation {

    @MyMessage(name = "A", desc = "静态变量a")
    private static int a = 2;

    public static void main(String[] args) {
        Class clazz = ParseAnnotation.class;
        Annotation[] annotations = clazz.getAnnotations();
    }
}
