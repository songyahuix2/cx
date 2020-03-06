package jdbc.jdbc02.page.dao.impl;


import jdbc.jdbc02.page.dao.DepartmentDao;
import jdbc.jdbc02.page.entity.Department;
import jdbc.jdbc02.page.util.DBConnection;
import jdbc.jdbc02.page.util.PageUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @date 8/16/2019 - 8:01 PM
 */
public class DepartmentDaoImpl implements DepartmentDao {

    public DepartmentDaoImpl(){}
    @Override
    public int insert(Department department) {
        String sql = "insert into dept values(?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt = DBConnection.getConnection().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pstmt.setInt(1,department.getDeptNo());
            pstmt.setString(2,department.getDeptName());
            pstmt.setString(3,department.getDeptLocation());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int rs =0;
        try {
            rs = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int update(Department department) {
        return 0;
    }

    @Override
    public int delete(int deptno) {
        return 0;
    }

    @Override
    public Department selectByDeptno(int deptno) {
        return null;
    }

    @Override
    public Department selectByDeptName(String deptName) {
        return null;
    }

    List<Department> list = new ArrayList<>();
    @Override
    public List<Department> selectAll() {
        Department department = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Connection connection =  DBConnection.getConnection();
        String sql = "select deptno,dname,loc from dept ";
        try {
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String dName=  rs.getString(2);
                String loc=  rs.getString(3);
                department = new Department(id,dName,loc);
                list.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int count() {
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        connection = DBConnection.getConnection();
        String sql = "select count(deptno) from dept";
        try {
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public List<Department> selectByPage(PageUtil<Department> page) {
        List<Department> list1 = new ArrayList<>();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Connection connection = DBConnection.getConnection();
        String sql ="select  deptno,dname,loc from dept limit ?,? ";
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1,page.getStartRecord());
            pstmt.setInt(2,page.getPageSize());
            rs = pstmt.executeQuery();
            while (rs.next()){
                int deptno =   rs.getInt(1);
                String dname=  rs.getString(2);
                String loc=  rs.getString(3);

                list1.add(new Department(deptno,dname,loc));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list1;
    }
}
