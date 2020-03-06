package jdbc.jdbc03.jdbctemplate.dao.impl;


import jdbc.jdbc03.jdbctemplate.dao.DepartmentDao;
import jdbc.jdbc03.jdbctemplate.dao.JdbcTemplate;
import jdbc.jdbc03.jdbctemplate.entity.Department;

import java.util.List;

public class DepartmentDaoImpl implements DepartmentDao {
private JdbcTemplate<Department> jdbcTemplate;

    public DepartmentDaoImpl(JdbcTemplate<Department> jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Department department) {
        return 0;
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
    public Department selectByPrimaryKey(int primaryKey) {
        String sql = "select * from dept where deptno = ?";
        Object[] args = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,args);
    }

    @Override
    public List<Department> select() {
        return null;
    }

    @Override
    public int count() {
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

    @Override
    public List<Department> selectAll() {
        return null;
    }
}
