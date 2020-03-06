package java04.day13_IO.bytestream;

import javax.sound.sampled.Line;
import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * @author shkstart
 * @date 8/1/2019 - 3:15 PM
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("F://A//b//test.txt");

        String content = "0lllalgaga";
        String content2 = "haha";
        Write.write(file,content,true);
        Write.write(file,content2,true);
        System.out.println(Read.read(file));
        writerTest();
        readerTest();
        inPutStreamTest();
    }
    public static void writerTest() throws IOException {
        Properties p =  System.getProperties();
        Set<String> nameSet = p.stringPropertyNames();
        for(String name:nameSet){
            System.out.println(name+"="+p.getProperty(name));
        }




//        File f = new File()
        String LINE_SEPARATOR = System.getProperty("line.separator");
        FileWriter fw = new FileWriter("text.txt",true);
        fw.write("zzzzzzzzzzzzzzzzzz"+LINE_SEPARATOR+"AAAAAAAAAAAAAAAAAAAAAAAAA");
        fw.flush(); //刷新
//        fw.close();  //刷新+关闭IO资源
    }
    public static void readerTest() throws IOException{
        FileReader fileReader = new FileReader("text.txt");
//        way1:单个字符读取
//        int a;
//        while ((a= fileReader.read())!=-1){
//            System.out.print((char)a);
//        }
//        way2:用
        char[] buffer = new char[10];
        int len = 0;
        int i ;
        while ((i=fileReader.read(buffer))!=-1){
            System.out.print(new String(buffer,0,i));
        }

    }

    public static void inPutStreamTest() throws IOException {
        InputStream i = System.in;
        int ch = i.read();
        int ch1 = i.read();
        int ch2 = i.read();
        System.out.println(ch1+'\n'+ch2);

    }
}
