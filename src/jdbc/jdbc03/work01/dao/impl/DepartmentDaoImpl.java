package jdbc.jdbc03.work01.dao.impl;
import jdbc.jdbc03.work01.entity.Department;
import jdbc.jdbc03.work01.dao.DepartmentDao;
import jdbc.jdbc03.work01.dao.JdbcTemplate;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 1:04 PM
 */
public class DepartmentDaoImpl implements DepartmentDao {

private JdbcTemplate<Department> jdbcTemplate;
public DepartmentDaoImpl(JdbcTemplate<Department> jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}

    @Override
    public int insert(Department department) {
    String sql = "insert into dept values(?,?,?)";
    Object[] objects = {department.getDeptNo(),department.getDeptName(),department.getDeptLocation()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(Department department) {
        String sql = "update dept set dname =?,loc =? where deptno = ?";
        Object[] args = {department.getDeptName(),department.getDeptLocation(),department.getDeptNo()};
        return this.jdbcTemplate.update(sql,args);
    }

    @Override
    public int delete(int primaryKey) {
        String sql = "delete from dept where deptno =?";
        Object[] args = {primaryKey};
        return this.jdbcTemplate.update(sql,args);
    }

    @Override
    public Department selectByPrimaryKey(int primaryKey) {
        String sql = "select deptno,dname,loc,from dept where deptno =?";
        Object[] args = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,args);
    }

    @Override
    public List<Department> select() {
        String sql = "select deptno,dname,loc from dept";
        return this.jdbcTemplate.selectForList(sql,null);
    }

    @Override
    public int count() {
       return select().size();
    }

    @Override
    public List<Department> selectByPage(PageUtil<Department> page) {
    String sql = "select deptno,dname,loc from dept limit ?,?";
    Object[] object = {page.getStartRecord(),page.getPageSize()};
    return this.jdbcTemplate.selectForList(sql,object);
    }
}
