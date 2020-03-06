package java04.day15_enum.work.pro_2;

public class Test2_Print {
    public static void main(String[] args) {
/*Print p1 = new Print(true);
Print p2 = new Print(false);
Thread t1 = new Thread(p1);
Thread t2 = new Thread(p2);
t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();*/

/**
 * 创建字母线程和数字线程，数字线程要先执行
 */
        Object obj = new Object();
        Num s = new Num(obj);
        Word z = new Word(obj);
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(z);
        t1.start();
        //为了保证数字先执行，使用join，时间设为1ms
        try {
            t1.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
