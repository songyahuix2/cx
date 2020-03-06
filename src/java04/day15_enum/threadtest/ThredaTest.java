package java04.day15_enum.threadtest;

/**
 * @author shkstart
 * @date 8/26/2019 - 7:30 AM
 */
class ThreadTest1 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<200;i++){
        System.out.println(i+"..."+Thread.currentThread().getName());
        }
    }
}
public class ThredaTest {

        }