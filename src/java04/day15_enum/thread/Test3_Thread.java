package java04.day15_enum.thread;

/**
 * @author shkstart
 * @date 8/3/2019 - 12:15 PM
 */
public class Test3_Thread extends Thread{
    public Test3_Thread(String test) {
super(test);
    }

    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread());
    }
}
