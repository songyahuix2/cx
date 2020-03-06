package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.dao.impl.MyOrderDaoImpl;
import jdbc.jdbc03.work02.entity.MyOrder;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/18/2019 - 8:35 PM
 */
public class MyOrderRowMapper implements RowMapper<MyOrder> {
    MyOrderDaoImpl myOrder = null;

    @Override
    public MyOrder mapper(ResultSet rs) {
        MyOrder myOrder = null;
            try {
                myOrder = new MyOrder(rs.getInt(1),new java.sql.Date(rs.getDate(2).getTime()),rs.getInt(3),rs.getInt(4));

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return myOrder;
    }
}
