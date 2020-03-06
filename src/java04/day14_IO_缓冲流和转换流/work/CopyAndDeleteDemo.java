package java04.day14_IO_缓冲流和转换流.work;

import java.io.*;

/**
 * @author shkstart
 * @date 8/2/2019 - 10:53 PM
 */
public class CopyAndDeleteDemo {
    public static void  pasteDir(File file, String copyPath){
        File file1 = new File(copyPath+File.separator+file.getName());
        if(file1.getParentFile().exists()){
            file1.mkdir();
        }
        else
            file1.mkdirs();
        paste(file1,copyPath+File.separator+file1.getName());
    }
    //递归遍历文件夹，有文件则调用IO流
    public static void paste(File file, String copyPath){
        File[] files = file.listFiles();
        for(int i = 0; i < files.length;i++){

            if (files[i].isDirectory()){
                File copyFile = new File (copyPath+File.separator+files[i].getName());
                copyFile.mkdirs();
                paste(files[i],copyPath+File.separator+files[i].getName());
            }
            else {
                copy(files[i].getPath(),copyPath+File.separator+files[i].getName());
            }
        }
        delete(file);
    }
    public static void paste(String path,String copyPath){
        File file = new File(path);
        paste(file,copyPath);
    }
    //复制
    public static void copy(String file1, String file2){
        InputStream in = null;
        OutputStream out = null;
        int temp;
        try {
            in = new FileInputStream(file1);
            out = new FileOutputStream(file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while((temp=in.read())!=-1){
                out.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(in!=null && out!=null){
                try {
                    in.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //删除
    public static void delete(File file){
        File[] files = file.listFiles();
        for(int i = 0; i < files.length;i++)
            if (files[i].isDirectory()){
                delete(files[i]);
                if(files[i].length()==0)
                    files[i].delete();
            }
            else files[i].delete();
        file.delete();
    }

    public static void main(String[] args) {
paste("f:"+File.separator+"A"+File.separator+"b"+File.separator+"test.txt","f:"+File.separator+"A");
    }

}
