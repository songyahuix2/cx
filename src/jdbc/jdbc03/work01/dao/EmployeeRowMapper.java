package jdbc.jdbc03.work01.dao;

import jdbc.jdbc03.work01.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/17/2019 - 11:00 PM
 */
public class EmployeeRowMapper implements RowMapper {
    @Override
    public Employee mapper(ResultSet rs) {
        Employee employee = null;
        try {

            employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), new java.sql.Date(rs.getDate(5).getTime()), rs.getFloat(6), rs.getFloat(7), rs.getInt(8));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}

