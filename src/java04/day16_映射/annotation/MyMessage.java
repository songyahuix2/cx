package java04.day16_映射.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author shkstart
 * @date 8/5/2019 - 4:26 PM
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.CLASS)
public @interface MyMessage {
    String name();
    int num() default 0;
    String desc();
}
