package jdbc.jdbc02.page.util;

import java.io.IOException;
import java.util.Properties;


/**
 * @author shkstart
 * @date 8/16/2019 - 8:25 PM
 */
public class DataBaseResourceUtil {
    private static Properties pro = new Properties();
    static {
        try {
            pro.load(DataBaseResourceUtil.class.getClassLoader().getResourceAsStream("jdbc/jdbc02/page/conf/dbtest.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getDriverName(){
        return pro.getProperty("drivername");
    }
    public static String getUrl(){
        return pro.getProperty("url");
    }
    public static String getUsername(){
        return pro.getProperty("username");
    }
    public static String getPassword(){
        return pro.getProperty("password");
    }
}
