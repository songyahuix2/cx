package jdbc.jdbc03.work02.dao;

import jdbc.jdbc03.work02.entity.ReceiveAddress;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author shkstart
 * @date 8/18/2019 - 8:54 PM
 */
public class ReceiveAddressRowMapper implements RowMapper<ReceiveAddress>{
ReceiveAddress receiveAddress = null;
    @Override
    public ReceiveAddress mapper(ResultSet rs) {
        try {
            receiveAddress = new ReceiveAddress(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return receiveAddress;
    }
}
