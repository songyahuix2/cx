package java04.day18_JDK新特性;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author shkstart
 * @date 8/7/2019 - 9:47 AM
 */
public class LambdaExpression {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("test","hh","tatat","keke");
        Collections.sort(names,new Comparator<String>() {
            @Override
            public int compare(String o1,String o2) {
                return o2.compareTo(o1);
            }
        }
        );
        //lambda表达式
        Collections.sort(names,(String a,String b)->{
            return b.compareTo(a);
        });
    }
}

