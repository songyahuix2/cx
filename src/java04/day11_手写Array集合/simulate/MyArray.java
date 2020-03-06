package java04.day11_手写Array集合.simulate;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/29/2019 - 1:46 PM
 */
public class MyArray<T> {
    private Object[] defaultArray = null;
    int count = 0;
    private MyArray(){
        this(10);
    }

    public MyArray(int capacity) {
        defaultArray = new Object[capacity];
    }
    public void add(Object element){

        if(count>=defaultArray.length){
            defaultArray = Arrays.copyOf(defaultArray,defaultArray.length*2+1);
        }
        defaultArray[count++] = element;
    }
    public int size()
    {
        return count;
    }
    public T get (int index){
        if(index >= count){
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        else
            return (T)defaultArray[index];
    }
}
