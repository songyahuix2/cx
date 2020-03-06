package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.entity.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/18/2019 - 8:50 PM
 */
public class ProductRowMapper implements RowMapper<Product> {
    private Product product = null;
    @Override
    public Product mapper(ResultSet rs) {
        try {
            product = new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }
}
