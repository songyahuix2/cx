package java04.day19thread;

public class ThreadDemo{
        static String str ="" ;
    public static void main(String[] args){
        System.out.println("str="+str);
        int j=0;
        Runnable r = new Runnable() {
            @Override
            public void run() {
                long i = 0;
                while (i<100000){
                    i++;
                    System.out.println("i="+i);
                }
                System.out.println("currentThread:"+Thread.currentThread()+","+"name:"+Thread.currentThread().getName());
            }
        };
        Thread t  =  new Thread(r);
        t.start();

        while (j<100000){
            j++;
            System.out.println("j="+j);
        }
        System.out.println("currentThread:"+Thread.currentThread()+","+"mainName:"+Thread.currentThread().getName());
    }
}
