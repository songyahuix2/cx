package java04.day15_enum.thread;

/**
 * @author shkstart
 * @date 8/3/2019 - 12:19 PM
 */
public class ClassMain {
    public static void main(String[] args) {

        Test3_Thread thread = new Test3_Thread("test");
        thread.start();
        System.out.println("当前线程："+Thread.currentThread());
        Thread thread1 = new Thread(new Test4_Runnable());
        thread1.start();
        for(int i = 0;i<200;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"....."+i);
        }
    }
}
