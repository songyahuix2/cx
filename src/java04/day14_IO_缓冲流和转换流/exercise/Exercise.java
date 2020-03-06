package java04.day14_IO_缓冲流和转换流.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shkstart
 * @date 8/26/2019 - 7:23 AM
 */
public class Exercise {
    public static void main(String[] args) {
        File direction = new File("F:"+System.getProperty("line.separator")+"A"+File.separator+"c"+File.separator+"d");
        direction.mkdirs();
        File file = new File("F:"+System.getProperty("line.separator")+"A"+File.separator+"c"+File.separator+"d"+"test.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bw.write("test");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
