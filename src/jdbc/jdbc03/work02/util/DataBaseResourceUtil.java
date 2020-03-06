package jdbc.jdbc03.work02.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author shkstart
 * @date 8/17/2019 - 7:18 PM
 */
public class DataBaseResourceUtil {
   private static Properties properties = new Properties();
   static{
       try {
           properties.load(DataBaseResourceUtil.class.getClassLoader().getResourceAsStream(("jdbc/jdbc03/work02/conf/dbcon.properties")));
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public static String getDrivername(){
       return properties.getProperty("drivername");
   }
   public static String getUrl(){
       return properties.getProperty("url");
   }
   public static String getUser(){
       return properties.getProperty("username");
   }
   public static String getPassword(){
       return properties.getProperty("password");
   }
}

