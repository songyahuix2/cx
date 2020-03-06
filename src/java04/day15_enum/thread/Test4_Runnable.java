package java04.day15_enum.thread;

/**
 * @author shkstart
 * @date 8/3/2019 - 12:50 PM
 */
public  class Test4_Runnable implements Runnable{
    @Override
    public void run() {
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

