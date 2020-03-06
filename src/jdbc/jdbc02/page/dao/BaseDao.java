package jdbc.jdbc02.page.dao;

import jdbc.jdbc02.page.entity.Department;

/**
 * @author shkstart
 * @date 8/16/2019 - 10:35 PM
 */
public interface BaseDao {
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


}
