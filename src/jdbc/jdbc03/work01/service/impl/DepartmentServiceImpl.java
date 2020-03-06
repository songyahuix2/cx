package jdbc.jdbc03.work01.service.impl;

import jdbc.jdbc03.work01.dao.DepartmentDao;
import jdbc.jdbc03.work01.dao.DepartmentRowMapper;
import jdbc.jdbc03.work01.dao.JdbcTemplate;
import jdbc.jdbc03.work01.dao.impl.DepartmentDaoImpl;
import jdbc.jdbc03.work01.entity.Department;
import jdbc.jdbc03.work01.service.DepartmentService;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:40 PM
 */
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public PageUtil<Department> getPage(int pagecode) {
        JdbcTemplate<Department> jdbcTemplate = new JdbcTemplate<>(new DepartmentRowMapper());
        DepartmentDao dao = new DepartmentDaoImpl(jdbcTemplate);
        PageUtil<Department> page  = new PageUtil<>(pagecode);//没有传页码 默认第一页
        int totalRecord = dao.count();//获得总记录数
        page.setTotalRecord(totalRecord);//设置总记录数到PageUtil
        page.setTotalPages((int)Math.ceil(totalRecord/page.getPageSize()));//设置总页码到PageUtil
        //2.调用dao 数据库查询，开始分页查询
        List<Department> departments = dao.selectByPage(page);
        //3.封装页码信息+数据集合
        page.setModelList(departments);
        System.out.println(page.toString());
        return page;
    }
}
