package jdbc.jdbc03.jdbctemplate.dao;
import java.sql.ResultSet;

/**
 * @author shkstart
 * @date 8/17/2019 - 12:43 PM
 *
 * 将数据库中查询的结果映射封装到Java对象T
 * @param <T>
 */
public interface RowMapper<T> {

    /**
     * 将数据库中查询的结果映射封装到Java对象T
     * @param rs    数据库中查询的结果
     * @return  返回对应的封装的Java对象
     */
    public T mapper(ResultSet rs);
}
