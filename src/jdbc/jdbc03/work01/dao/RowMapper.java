package jdbc.jdbc03.work01.dao;

import java.sql.ResultSet;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:45 PM
 */
public interface RowMapper<T> {
    /**
     * 将数据库中的查询结果映射封装到Java对象T
     * @param rs 数据库中查询的结果
     * @return 返回对应的而封装的Java对象
     */
    public T mapper(ResultSet rs);
}
