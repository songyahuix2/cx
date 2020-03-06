package java04.day19thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorTest {
    private static Integer pages=1;//网页数
    private static boolean exeFlag = true;//执行标识

    public static void main(String[] args) {
        //创建Executor Service连接池创建固定的10个初始线程
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        while (exeFlag){
            if(pages<=100){
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("爬取第"+pages+"个网页");
                        pages++;
                    }
                });
            }
            else{
                if(((ThreadPoolExecutor)executorService).getActiveCount()==0){//如果活动线程是0
                    executorService.shutdown();
                    exeFlag = false;
                    System.out.println("爬取结束");
                }
            }
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
