package jdbc.jdbc03.work02.dao.impl;



import jdbc.jdbc03.work02.dao.BaseDao;
import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.entity.ReceiveAddress;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:47 PM
 */
public class ReceiveAddressDaoImpl implements BaseDao<ReceiveAddress> {
private JdbcTemplate<ReceiveAddress> jdbcTemplate;
public ReceiveAddressDaoImpl(JdbcTemplate<ReceiveAddress> jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}
    @Override
    public int insert(ReceiveAddress receiveddress) {
    String sql = "insert into receive_address values (?,?,?,?,?,?,?)";
    Object[] objects = {receiveddress.getAddressId(),receiveddress.getUserId(),receiveddress.getAddressProvince(),receiveddress.getAddressCity(),receiveddress.getAddressArea(),receiveddress.getAddressTown(),receiveddress.getAddressDetail()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(ReceiveAddress receiveddress) {
    String sql = "update receive_address set cust_id = ?,address_province = ?,address_city = ?,address_area = ?,address_town = ?,address_detail = ? where address_id = ?";
    Object[] objects ={receiveddress.getUserId(),receiveddress.getAddressProvince(),receiveddress.getAddressCity(),receiveddress.getAddressArea(),receiveddress.getAddressTown(),receiveddress.getAddressDetail(),receiveddress.getAddressId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(ReceiveAddress receiveAddress) {
        String sql = "delete from receive_address where address_id = ?";
        Object[] object = {receiveAddress.getAddressId()};
        return this.jdbcTemplate.update(sql,object);
    }



    @Override
    public ReceiveAddress selectByPrimaryKey(int primaryKey) {
    String sql = "select * from receive_address where address_id = ?";
    Object[] objects = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }

    @Override
    public List<ReceiveAddress> selectByPage(PageUtil<ReceiveAddress> page) {
        return null;
    }

    @Override
    public List<ReceiveAddress> select() {
    String sql = "select * from receive_address";
        return this.jdbcTemplate.selectForList(sql,null);
    }

    @Override
    public int count() {
        return this.select().size();
    }
}
