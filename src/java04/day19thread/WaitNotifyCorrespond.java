package java04.day19thread;
class Input_2 implements Runnable{
    Resource r;
    Input_2(Resource r){
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            synchronized (r){
                if(r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    r.name="songyajhu";
                    r.sex="male";
                    System.out.println("。。。。。。。。。。。。。r.name:"+r.name+"r.sex:"+r.sex);

                    r.flag = !r.flag;
                    r.notify();
                }
            }
        }
    }
}
class Output_2 implements Runnable{
    Resource r;
    Output_2(Resource r){
        this.r = r;
    }
    @Override
    public void run() {
        while (true){
            synchronized (r){
                if(!r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    System.out.println("r.name:"+r.name+"r.sex:"+r.sex);
                    r.flag = !r.flag;
                    r.notify();
                }
            }
        }
    }
}
public class WaitNotifyCorrespond {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input_2 i = new Input_2(r);
        Output_2 o = new Output_2(r);
        Thread t1 = new Thread(i);
        Thread t2 = new Thread(o);
        t1.start();
        t2.start();
    }
}
