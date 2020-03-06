package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.entity.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/18/2019 - 7:10 PM
 */
public class CustomerRowMapper implements RowMapper<Customer> {
    @Override
    public Customer mapper(ResultSet rs) {
      Customer customer = null;
        try {
            customer = new Customer(rs.getInt(1),rs.getString(2));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;

    }


}
