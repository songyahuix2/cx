package java04.day14_IO_缓冲流和转换流.work;

import java.io.*;

/**
 * @author shkstart
 * @date 8/2/2019 - 6:34 PM
 */

public class Compare_Buffer_NOBuffer {
    public static void main(String[] args) {
        String str = "tetatatatagagajianggjfakjgkaghaghja javklavjkajbjkbh  ssgshshshshs gshghshsaruithqn fjkajj kk jgl jajfha hfhafhajgaafagafjafagjagjagagaagafaafa";
        File file = new File("f:"+File.separator+"A"+File.separator+"d"+File.separator+"test.txt");
        write(file,str);
        System.out.println(buffer(file));
        System.out.println(nobuffer(file));

    }
    public static File write(File file,String str){
        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return file;
    }

    public static String buffer(File file){
        Reader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line1 = null;
        String line3 = "";
        String line4 = new String();
        System.out.println(line1);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line1==line3);
        String line = "";
        System.out.println(line);
        String line2 = "";
        try {
            while ((line = ((BufferedReader) bufferReader).readLine())!=null){
                line2 += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if(bufferReader!=null){
                try {
                    bufferReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long l2 = System.currentTimeMillis();
        return line2;
    }
    public static String nobuffer(File file){
        Reader r = null;
        try {
           r = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int count=0;
        int temp = 0;
        char[] chars =new char[(int)file.length()];
        try {
            while ((temp = r.read())!=-1){
                chars[count++] = (char)temp;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(r!=null){
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long l2 = System.currentTimeMillis();
        return new String(chars);
    }
}
