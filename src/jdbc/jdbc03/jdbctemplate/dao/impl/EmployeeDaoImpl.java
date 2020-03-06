package jdbc.jdbc03.jdbctemplate.dao.impl;


import jdbc.jdbc03.jdbctemplate.entity.Employee;
import jdbc.jdbc03.jdbctemplate.dao.EmployeeDao;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public int insert(Employee employee) {

        return 0;
    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public int delete(int primaryKey) {
        return 0;
    }

    @Override
    public Employee selectByPrimaryKey(int primaryKey) {
        return null;
    }

    @Override
    public List<Employee> select() {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }
}
