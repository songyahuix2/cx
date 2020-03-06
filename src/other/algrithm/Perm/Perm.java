package other.algrithm.Perm;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author shkstart
 * @date 2019/11/4 - 15:28
 */
//编写一个线程程序、实现A线程先循环2次、接着B线程循环3次、再接着子线程循环2次、主线程循环3次、反复进行5次
/*
* 有一串字符串String s = "xyxyxy"， 这个字符串可以看做由3个"xy"构成，即n=3，L = "xy"，s = n*L。
* 现在要求编写一段程序，使用单例模式，输入任意字符串s，输出nL。
* 如输入：xxxxx 输出 5x ，输入：xyxyx 输出：1xyxyx
* */

public class Perm {
    /**
          * 判断字符串是否包含重复字符
          * @param str
          * @return
          */

    public static int JumpFloor(int target) {
        if(target==1){
            return 1;
        }
        if(target==2){
            System.out.println(UUID.randomUUID());
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }



    public static void main(String[] args) {
        JumpFloor(10);

//        String str ="#name:jack;#age:24;#birthday:1995/10/24 00:00:00;";
//        String[] sub = str.split("#");
//        for (String s:sub) {
//            if(s.length()==0){
//            }
//            else {
//                if(s.contains("name:")){
//                    System.out.println(s=s.substring(5,s.length()-1));
//                }
//                if(s.contains("age:")){
//                    System.out.println(s=s.substring(4,s.length()-1));
//                }
//                if(s.contains("birthday:")){
//                    System.out.println(s=s.substring(9,s.length()-1));
//                }
//            }
//        }

//        Thread thread1 = new Thread(new A());
//        thread1.setPriority(10);
//        Thread thread2 = new Thread(new B());
//        thread2.setPriority(5);
//        for (int A=0;A<5;A++){
//            for (int i1=0;i1<2;i1++){
//                thread1.start();
//            }
//            for(int i2=0;i2<3;i2++){
//                thread2.start();
//            }
//            for(int i3=0;i3<2;i3++){
//                thread1.start();
//                thread2.start();
//            }
//            for(int i4=0;i4<3;i4++){
//                System.out.println("主线程："+Thread.currentThread());
//            }
//        }
    }
}

class A implements Runnable{
    public void run() {
        System.out.println("A线程:"+Thread.currentThread());
    }
}
class B implements Runnable{
    public void run()
    {
        System.out.println("B线程:"+Thread.currentThread());
    }
}
