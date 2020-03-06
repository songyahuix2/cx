package jdbc.jdbc02.page.service.impl;

import jdbc.jdbc02.page.dao.DepartmentDao;
import jdbc.jdbc02.page.dao.impl.DepartmentDaoImpl;
import jdbc.jdbc02.page.entity.Department;
import jdbc.jdbc02.page.service.DepartmentService;
import jdbc.jdbc02.page.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/16/2019 - 10:49 PM
 */
public class DepartmentServiceImpl implements DepartmentService {

    @Override
    public PageUtil<Department> getByPage(int pageCode) {
        DepartmentDao dao = new DepartmentDaoImpl();
        //1.封装页码信息
        PageUtil<Department> page = new PageUtil<>(pageCode);//没有传页码 默认第一页
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
