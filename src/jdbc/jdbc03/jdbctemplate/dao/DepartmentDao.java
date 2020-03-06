package jdbc.jdbc03.jdbctemplate.dao;

import jdbc.jdbc03.jdbctemplate.entity.Department;

import java.util.List;

/**
 * 该接口中定义了部门数据的操作（增删改查CRUD）
         *
         * Connection : 数据库连接
         * Statement:   执行静态SQL语句
         * ResultSet:   查询结果结合
         *
         * */
public interface DepartmentDao extends BaseDao<Department>{
    /**
     * 添加新部门
     * @param department 需要添加的部门
     * @return  返回数据库表中受影响行数
     */
    public int insert(Department department);

    /**
     * 修改部门信息
     * @param department 需要修改的部门
     * @return  返回数据库表中受影响行数
     */
    public int update(Department department);


    /**
     * 删除某个部门
     * @param deptno   根据主键删除部门
     * @return   返回数据库表中受影响行数
     */
    public int delete(int deptno);


    /**
     * 根据主键查询部门
     * @param deptno    部门主键
     * @return  返回对应的部门对象
     */
    public Department selectByDeptno(int deptno);


    /**
     * 根据名称查询部门
     * @param deptName 部门名称
     * @return  返回对应部门对象
     */
    public Department selectByDeptName(String deptName);


    //查询所有的部门
    public List<Department> selectAll();

}
