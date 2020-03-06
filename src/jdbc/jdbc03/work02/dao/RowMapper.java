package jdbc.jdbc03.work02.dao;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:56 PM
 */
public interface RowMapper<T> {
    public T mapper(ResultSet rs);
}
