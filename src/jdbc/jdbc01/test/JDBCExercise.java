package jdbc.jdbc01.test;



import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCExercise {
    public static <con> void main(String[] args) {
        //创建驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //建立连接
        String url = "jdbc:mysql://localhost:3306/empdatebase";
        String user = "root";
        String passwd = "961003";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,user,passwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //创建执行状态
        Statement st = null;
        try {
            st = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //执行语句
        ResultSet rs = null;
        try {
            rs = st.executeQuery("select * from dept");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //处理rs
        List<Department> list = new ArrayList<>();
        try {
            while (rs.next()){
                Department department = new Department(rs.getInt("deptno"),rs.getString("dname"),rs.getString("loc"));
                list.add(department);
            }

            System.out.println(list);
            System.out.println(list.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
