package jdbc.jdbc03.work01.service.impl;

import jdbc.jdbc03.work01.dao.EmployeeDao;
import jdbc.jdbc03.work01.dao.EmployeeRowMapper;
import jdbc.jdbc03.work01.dao.JdbcTemplate;
import jdbc.jdbc03.work01.dao.impl.EmployeeDaoImpl;
import jdbc.jdbc03.work01.entity.Employee;
import jdbc.jdbc03.work01.service.EmployeeService;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:40 PM
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public PageUtil<Employee> getPage(int pageCode) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(new EmployeeRowMapper());
        EmployeeDao employeeDao = new EmployeeDaoImpl(jdbcTemplate);
        PageUtil<Employee> pageUtil = new PageUtil<>(2);
        int totalRecord = employeeDao.count();
        pageUtil.setTotalRecord(totalRecord);
        pageUtil.setTotalPages((int)Math.ceil(totalRecord/pageUtil.getPageSize()));
        List<Employee> employees = employeeDao.selectByPage(pageUtil);
        pageUtil.setModelList(employees);
        System.out.println(pageUtil.toString());
       return pageUtil;
    }
}
