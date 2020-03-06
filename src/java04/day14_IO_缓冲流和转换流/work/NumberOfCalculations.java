package java04.day14_IO_缓冲流和转换流.work;

import java.io.*;
import java.util.*;

/**
 * @author shkstart
 * @date 8/2/2019 - 9:28 PM
 */
public class NumberOfCalculations {
    public static List<Character> list  = new ArrayList<>();
    public static Map<Character,Integer> map  = new HashMap<>();
    public static void main(String[] args) {
        File file = new File("paste:\\A\\b\\test.txt");
        try {
            read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        calculate(list);
        System.out.println(map);
    }
 public static void read(File file) throws IOException {
     Reader reader = null;
     try {
         reader = new FileReader(file);
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }
     int temp = 0 ;
     try {
         while ((temp=reader.read())!=-1){
             list.add((char)temp);
         }
     } catch (IOException e) {
         e.printStackTrace();
     }
finally {
         if(reader!=null){
             try {

                 reader.close();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
     }

 }

public static Map<Character,Integer> calculate(List<Character> list){
    for (Iterator<Character> iterator = list.iterator();iterator.hasNext();) {
        char c = iterator.next();
       if( !map.containsKey(c)){
           map.put(c,1);
        }
       else
           map.put(c,map.get(c)+1);
    }
return map;
}
}
