package jdbc.jdbc04_druid.util;

import java.io.IOException;
import java.util.Properties;

/**
 * @author shkstart
 * @date 8/19/2019 - 3:49 PM
 */
public class DBResourceUtil {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(DBResourceUtil.class.getClassLoader().getResourceAsStream("jdbc/jdbc04_druid/conf/dbcon.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
