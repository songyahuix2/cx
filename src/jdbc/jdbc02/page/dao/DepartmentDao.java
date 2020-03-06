package jdbc.jdbc02.page.dao;
/**
 * @author shkstart
 * @date 8/15/2019 - 11:09 AM
 */

import jdbc.jdbc02.page.entity.Department;
import jdbc.jdbc02.page.util.PageUtil;

import java.util.List;

/**
 * 该接口中定义了部门数据的操作（增删改查CRUD）
 *
 * Connection : 数据库连接
 * Statement:   执行静态SQL语句
 * ResultSet:   查询结果结合
 *
 * */
public interface DepartmentDao extends BaseDao{

    List<Department> selectAll();

    int count();

    List<Department> selectByPage(PageUtil<Department> page);
}

