package jdbc.jdbc03.work01.dao.impl;

import jdbc.jdbc03.work01.dao.JdbcTemplate;
import jdbc.jdbc03.work01.entity.Employee;
import jdbc.jdbc03.work02.util.PageUtil;
import jdbc.jdbc03.work01.dao.EmployeeDao;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 1:04 PM
 */
public class EmployeeDaoImpl implements EmployeeDao {
private JdbcTemplate<Employee> jdbcTemplate;
public EmployeeDaoImpl(JdbcTemplate<Employee> jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}
    @Override
    public int insert(Employee employee) {
        String sql = "insert into emp values(?,?,?,?,?,?,?,?)";
        Object[] objects = {employee.getEmpNo(),employee.getEmpName(),employee.getEmpJob(),employee.getEmpMgr(),employee.getEmpHiredate(),employee.getEmpSalary(),employee.getEmpComm(),employee.getDeptno()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(Employee employee) {
    String sql = "update emp set ename = ?,job = ?,mgr=?,hiredate=?,salary=?,comm=?,deptno=?";
        Object[] objects = {employee.getEmpName(),employee.getEmpJob(),employee.getEmpMgr(),employee.getEmpHiredate(),employee.getEmpSalary(),employee.getEmpComm(),employee.getDeptno()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(int primaryKey) {
    String sql = "delete from emp where empno = ?";
    Object[] objects={primaryKey};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public Employee selectByPrimaryKey(int primaryKey) {
    String sql = "select * from emp where empno = ?";
            Object[] objects = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }

    @Override
    public List<Employee> select() {
    String sql = "select * from emp";
        return this.jdbcTemplate.selectForList(sql,null);
    }

    @Override
    public int count() {
        return this.select().size();
    }

    @Override
    public List<Employee> selectByPage(PageUtil<Employee> page) {
    String sql ="select empno,ename,job,mgr,hiredate,salary,comm,deptno from emp limit ?,?";
    Object[] objects = {page.getStartRecord(),page.getPageSize()};
    return this.jdbcTemplate.selectForList(sql,objects);
    }
}
