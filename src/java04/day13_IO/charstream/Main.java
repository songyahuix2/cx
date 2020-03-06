package java04.day13_IO.charstream;

import java.io.*;

/**
 * @author shkstart
 * @date 8/1/2019 - 10:24 PM
 */
public class Main {
    public static void main(String[] args) {
File file = new File("paste:+"+ File.separator +"+//A//b//c");
file.mkdir();
File file1 = new File("paste:"+File.separator+"A//b//c//test.txt");
String content = "test"+"cccccccccccccccc";
write(file1,content,true);
        System.out.println(read(file1));
    }

    public static String read(File file){
        Reader r = null;
        try {
            r = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int temp = 0;
        char[] chars = new char[(int) file.length()];
        int count = 0;



        try {
            while (!!((temp = r.read())!=-1))
             chars[count++] = (char) temp;

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                r.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            return new String(chars);
        }


    public static File write(File file, String content, boolean boo){
        FileWriter fw = null;
        try {
           fw = new FileWriter(file,boo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fw!=null){
                fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
