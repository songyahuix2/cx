package jdbc.jdbc03.work01.dao;

import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:03 PM
 */
public interface BaseDao<T> {
    public int insert(T t);
    public int update(T t);
    public int delete(int primaryKey);

    public T selectByPrimaryKey(int primaryKey);
    public List<T> select();
    int count();
    List<T> selectByPage(PageUtil<T> page);
}
