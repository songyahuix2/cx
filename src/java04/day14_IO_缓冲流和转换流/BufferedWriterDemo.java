package java04.day14_IO_缓冲流和转换流;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author shkstart
 * @date 8/2/2019 - 9:37 AM
 */
public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file = new File("paste:"+System.getProperty("line.separator")+"A"+File.separator+"c");
        file.mkdir();

        File file1 = new File("paste:"+System.getProperty("line.separator")+"A"+File.separator+"c"+File.separator+"test.txt");
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file1));
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
            if(bw != null){
                try {
                   bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
