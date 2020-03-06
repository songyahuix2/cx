package jdbc.jdbc03.jdbctemplate.dao;

import jdbc.jdbc03.jdbctemplate.entity.Department;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/17/2019 - 1:25 PM
 */
public class DepartmentRowMapper implements RowMapper<Department>{
    @Override
    public Department mapper(ResultSet rs) {
        Department department = null;
        try{
            if(!rs.next()){
                int deptno = rs.getInt(1);
                String deptName = rs.getString(2);
                String deptLoc = rs.getString(3);
                department = new Department(deptno,deptName,deptLoc);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return department;
    }
}
