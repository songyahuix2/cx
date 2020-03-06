package java04.day13_IO.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author shkstart
 * @date 8/1/2019 - 3:38 PM
 */
public class Read {
    public static String read(File file){
        FileInputStream fileInputStream = null;
        try {
         fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int temp;
        byte[] bytes = null;
        int count =0;
        try {
            bytes = new byte[fileInputStream.available()];
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            while ((temp = fileInputStream.read())!=-1){
                    bytes[count++] = (byte)temp;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileInputStream!=null){
                fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new String(bytes);
    }
}
