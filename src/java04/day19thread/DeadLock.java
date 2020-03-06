package java04.day19thread;

import java.io.File;

class MyLock{
    public static Object lockA = new Object();
    public static Object lockB = new Object();
}
class Test implements Runnable{
    private boolean flag;
    Test(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            while (true){
                synchronized (MyLock.lockA){
                    System.out.println(Thread.currentThread().getName()+"if...(lockA)");
                    synchronized (MyLock.lockB){
                        System.out.println(Thread.currentThread().getName()+"if...(lockB)");
                    }
                }
            }
        }
        else
            while (true){
                synchronized (MyLock.lockB){
                    System.out.println(Thread.currentThread().getName()+"if...(lockB)");
                    synchronized (MyLock.lockA){
                        System.out.println(Thread.currentThread().getName()+"if...(lockA)");
                    }
                }
            }

    }
}
public class DeadLock{
    public static void main(String[] args){
        Test t1 = new Test(true);
        Test t2 = new Test(false);
        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
/*class Test implements Runnable {
    private boolean flag;
    Test(boolean flag){
        this.flag = flag;
    }
    public void run(){
        if(flag){
            while (true){
                synchronized (MyLock.lockA){
                    System.out.println(Thread.currentThread().getName()+"if...(lockA)");
                    synchronized (MyLock.lockB){
                        System.out.println(Thread.currentThread().getName()+"if...(lockB)");
                    }
                }
            }
        }
        else {
            while (true){
                synchronized (MyLock.lockB){
                    System.out.println("...........lockB.............");
                    synchronized (MyLock.lockA){
                        System.out.println(".............lockA............");
                    }
                }
            }
        }
    }
}

class MyLock {
    public static Object lockA = new Object();
    public static Object lockB = new Object();
}

public class DeadLock {
    public static void main(String[] args) {
        Test a = new Test(true);
        Test b = new Test(false);
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}*/
