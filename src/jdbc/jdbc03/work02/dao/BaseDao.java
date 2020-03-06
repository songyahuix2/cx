package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:04 PM
 */
public interface BaseDao<T> {
    public int insert(T t);
    public int update(T t);
    public int delete(T t);
    public List<T> select();
    public T selectByPrimaryKey(int primaryKey);
    List<T> selectByPage(PageUtil<T> page);
    public int count();
}
