package java04.day11_手写Array集合.work.Test_2;

import java.util.Arrays;

/**
 * @author shkstart
 * @date 7/29/2019 - 6:34 PM
 */
public class MailAddressArrayList<T> {
  private Object[] arr = null;
  int count = 0 ;
  public MailAddressArrayList(){
      this(10);
  }

    public MailAddressArrayList(int capacity) {
        arr = new Object[capacity];
    }
    public void add(T element){
      if(count>=arr.length){
arr = Arrays.copyOf(arr,arr.length*2+1);
      }
      arr[count++] = element;
        System.out.println("添加成功");
    }
    public T display(int index){
      if(index >= count){
          throw new ArrayIndexOutOfBoundsException("下标越界");
      }
      else
          System.out.println((T)arr[index].toString());
      return (T)arr[index];
    }
    public int size(){
      return count;
    }


}
