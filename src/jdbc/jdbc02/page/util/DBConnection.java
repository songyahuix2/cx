package jdbc.jdbc02.page.util;

import java.sql.*;

/**
 * @author shkstart
 * @date 8/16/2019 - 8:11 PM
 */
public class DBConnection {
    private static Connection connection;
/**
 * @return 返回连接对象
 */
public static Connection getConnection() {

    try {
        Class.forName(DataBaseResourceUtil.getDriverName());
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    try {
        connection = DriverManager.getConnection(DataBaseResourceUtil.getUrl(),DataBaseResourceUtil.getUsername(),DataBaseResourceUtil.getPassword());
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return connection;
}
public static void closeConnection(PreparedStatement pdstm, ResultSet rs){
    if(connection!=null){
        try {
            rs.close();
            pdstm.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
