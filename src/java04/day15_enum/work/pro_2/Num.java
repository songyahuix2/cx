package java04.day15_enum.work.pro_2;

/**
 * @author shkstart
 * @date 8/5/2019 - 7:26 AM
 */
class Num implements Runnable {
    private Object obj;//声明一个类的引用
    int i = 1;
    public Num(Object obj) {
        this.obj = obj;    //通过构造器将共享的资源-->对象传进来
    }

    @Override
    public void run() {
        synchronized (obj) {//给共享资源上锁
            for (; i < 53; i++) {
                if (i < 27) {
                    System.out.print(i);

                    obj.notify();//唤醒其他线程

                    try {

                        obj.wait();//等待并释放锁
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                } else
                    System.out.print(i);


            }
        }

    }

}

