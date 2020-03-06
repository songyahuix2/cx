package java04.day15_enum.work.pro_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 8/3/2019 - 10:02 PM
 */
class Input implements Runnable {
    private List<Integer> list = null;

    public Input(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = -100; i < 101; i++) {
            list.add(i);
            System.out.println("当前执行线程：" + Thread.currentThread() + ",添加值：" + i);

        }
    }
}

class Output implements Runnable {
    private List<Integer> list = null;

    public Output(List<Integer> list) {
        this.list = list;

    }

    @Override
    public void run() {
        estimate();
        for (int i = 0; i < 201; i++) {

            System.out.println("当前执行线程：" + Thread.currentThread() + ",读取值：" + list.get(i));
        }

    }
    public void estimate(){
    while (list.size()<40){
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}

public class Test1_InputAndOutput {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Thread t1 = new Thread(new Input(list));
        Thread t2 = new Thread(new Output(list));
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();

    }
}
