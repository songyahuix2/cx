package java04.day13_IO.bytestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author shkstart
 * @date 8/1/2019 - 3:15 PM
 */
public class Write {

    public static File write(File file,String content ,boolean append){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file,append);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            fileOutputStream.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fileOutputStream != null){

                fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
