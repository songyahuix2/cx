package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.entity.OrderDetail;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/18/2019 - 8:47 PM
 */
public class OrderDetailRowMapper implements RowMapper<OrderDetail> {
    private OrderDetail orderDetail = null;
    @Override
    public OrderDetail mapper(ResultSet rs) {
        try {
            orderDetail = new OrderDetail(rs.getInt(1),rs.getInt(2),rs.getInt(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderDetail;
    }
}
