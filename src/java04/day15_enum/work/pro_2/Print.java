package java04.day15_enum.work.pro_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author shkstart
 * @date 8/4/2019 - 10:00 PM
 */
class Print implements Runnable {
    boolean flag = true;
    int i = 1;
    int j = 'A';
    public static Vector<Object> vector = new Vector<>();

    public Print(boolean flag)
    {
        this.flag = flag;
    }

    @Override
    public void run() {

            if (flag) {
                synchronized (vector) {
                if (i < 27) {
                    synchronized (vector) {
                        for (; i < 27; i++) {
                            if (i == 1) {
                                vector.add(i);
                                try {
                                   vector.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            else {

                                vector.add(i);
                                vector.notifyAll();
                                try {
                                    vector.wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }

                            }
                        }
                    }
                }
            }
            if (i >= 27) {
                for (; i < 53; i++) {
                    vector.add(i);
                    if (i == 52) {

                    }
                }
            }
        }

            if (!flag) {
                synchronized (vector) {
                if (vector.get(0) == null) {
                    synchronized (vector) {
                        Thread.yield();
                    }
                } else {
                    for (; j < 'z' + 1; j++) {

                        vector.add((char)i);
                        vector.notifyAll();
                        try {
                            vector.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }

        }

    }
}
