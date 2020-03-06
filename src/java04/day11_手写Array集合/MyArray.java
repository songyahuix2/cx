package java04.day11_手写Array集合;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/28/2019 - 1:31 PM
 */
public class MyArray<T> {
    //容器的本质是数组
    private Object[] defaultArray = null;
private int count = 0;
public MyArray(){
    this(10);
}
public MyArray(int capacity){
    defaultArray = new Object[capacity];

}
public void add(T element){
    if(count>= defaultArray.length){
        defaultArray = Arrays.copyOf(defaultArray,defaultArray.length* 2 +1);
    }
        defaultArray[count++] = element;
}
public int size(){
    return count;
}
public T get(int index){
    if(index >= count){
        throw new ArrayIndexOutOfBoundsException("下标越界");

    }
    else
        return (T)defaultArray[index];

}

}
