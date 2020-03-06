package jdbc.jdbc03.work01.dao;

import jdbc.jdbc03.work01.entity.Department;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author shkstart
 * @date 8/17/2019 - 8:49 PM
 */
public class DepartmentRowMapper implements RowMapper<Department> {

    @Override
    public Department mapper(ResultSet rs) {
        Department department = null;
        try {

            department = new Department(rs.getInt(1),rs.getString(2),rs.getString(3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return department;
    }
}
