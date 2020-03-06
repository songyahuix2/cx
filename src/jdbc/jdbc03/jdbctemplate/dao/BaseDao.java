package jdbc.jdbc03.jdbctemplate.dao;

import java.util.List;

public interface BaseDao<T> {

    public int insert(T t);
    public int update(T t);
    public int delete(int primaryKey);

    public T selectByPrimaryKey(int primaryKey);
    public List<T> select();
    public int count();

}
