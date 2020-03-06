package java04.day13_File;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @author shkstart
 * @date 8/1/2019 - 11:00 AM
 */
public class Test_1_File_基本方法的使用 {
    public static void main(String[] args) throws IOException {
//        File file1 = new File("f:\\A\\b");
//        file1.mkdir();
        Properties properties = System.getProperties();
        String[] strings = properties.toString().split(",");
        for(String str:strings){
            System.out.println(str);
        }
        File file1 = new File("/a/b");
        file1.mkdirs();
        File file2 = new File("f:\\A\\b\\test.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file1.toPath());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getParent());
        System.out.println(file1.getParentFile());
        System.out.println(file1.getParentFile().toString());
        System.out.println(file2.getParentFile().toString());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println();


    }
}
