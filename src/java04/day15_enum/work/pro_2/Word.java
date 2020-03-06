package java04.day15_enum.work.pro_2;

/**
 * @author shkstart
 * @date 8/5/2019 - 7:27 AM
 */
class Word implements Runnable{
    private Object obj;
    Integer i = null;
    public Word(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        //让Thread-0线程先执行，因此为了避免Thread-1先执行，需要sleep睡眠，或者在主线程中使用join
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(obj){
            for(int i = 'A';i < 'Z'+1;i++ ){
                System.out.print((char) i);
                this.i = i;
                if(i>='A'&&i<'Z'){
                    obj.notify();//唤醒其他线程
                    try {
                        obj.wait();//释放锁等待
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                else
                    obj.notify();

            }
        }

    }

}
