package java04.day13_File;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @date 8/1/2019 - 9:50 AM
 */
public class Test_2_File_递归遍历目录下的所有文件名称 {
    public static List<File> list= new ArrayList<>();

    public static void main(String[] args) {
        File file1 = new File("paste:\\A\\b");
        File file2 = new File("paste:\\A\\b\\test2.txt");
        //若该路径上层目录不存在，则调用mkdirs();
        file1.mkdirs();
        //若该路径上层目录都存在，则调用mkdir();
        file2.mkdir();
        //  System.out.println(list == seek(file1)); 结果为true
        Iterator<File> it = list.iterator();
        for(;it.hasNext();){
            System.out.println(it.next());
        }
    }
    public static List<File> seek(File file1) {
        if (file1.isDirectory()) {
            File[] files = file1.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println(files[i].getName() + "..." + files[i].getAbsolutePath());
                    list.add(files[i]);
                    return list;
                }
                else
                    seek(files[i]);
            }
            return null;
        }
        list.add(file1);
        return list;
    }
}