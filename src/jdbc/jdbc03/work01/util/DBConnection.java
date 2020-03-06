package jdbc.jdbc03.work01.util;

import java.sql.*;

/**
 * @author shkstart
 * @date 8/17/2019 - 7:17 PM
 */
public class DBConnection {
private static Connection connection = null;
public static Connection getConnection(){
    try {
        Class.forName(DataBaseResourceUtil.getDrivername());
        try {
            connection = DriverManager.getConnection(DataBaseResourceUtil.getUrl(),DataBaseResourceUtil.getUser(),DataBaseResourceUtil.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return connection;
}
public static void closeConnection(ResultSet rs,Statement statement){
    if(rs!=null){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    if(statement!=null){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    if(connection!=null){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    public static void closeConnection(Statement statement) {

        if(statement!=null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
