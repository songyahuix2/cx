package jdbc.jdbc01.test;

import jdbc.jdbc02.page.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 8/14/2019 - 4:56 PM
 */
public class JDBCTest {
    public static void main(String[] args)  {
        //1.创建驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.java连接数据库
        String url = "jdbc:mysql://localhost:3306/empdatebase";
        String username = "root";
        String password = "961003";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //3.创建语句，执行sql语句
        Statement st = null;

        try {
            st =  conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
          rs  = st.executeQuery("select * from dept ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        List<Department> list = new ArrayList<>();
        //4.处理结果
        try{
            while (rs.next()) {
                Department department = new Department(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
                list.add(department);
            }
            System.out.println(list);
            System.out.println(list.size());
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
