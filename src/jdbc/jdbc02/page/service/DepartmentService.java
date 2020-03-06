package jdbc.jdbc02.page.service;

import jdbc.jdbc02.page.entity.Department;
import jdbc.jdbc02.page.util.PageUtil;

/**
 * @author shkstart
 * @date 8/16/2019 - 10:47 PM
 */
public interface DepartmentService {
    public PageUtil<Department> getByPage(int pageCode);
}
