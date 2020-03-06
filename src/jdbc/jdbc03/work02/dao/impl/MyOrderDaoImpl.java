package jdbc.jdbc03.work02.dao.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.MyOrderDao;
import jdbc.jdbc03.work02.entity.MyOrder;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:39 PM
 */
public class MyOrderDaoImpl implements MyOrderDao {
    JdbcTemplate<MyOrder> jdbcTemplate;
    public MyOrderDaoImpl(JdbcTemplate<MyOrder> jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insert(MyOrder myOrder) {
        String sql = "inset into myorder values(？，？，？，？)";
        Object[] objects = {myOrder.getMyorderId(),myOrder.getMyorderTime(),myOrder.getUserId(),myOrder.getAddressId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(MyOrder myOrder) {
        String sql = "update myorder set order_time = ?,cust_id = ?,address_id = ? where order_id = ?";
        Object[] objects = {myOrder.getMyorderTime(),myOrder.getUserId(),myOrder.getAddressId(),myOrder.getMyorderId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(MyOrder myOrder) {
        String sql = "delete from myorder where order_id = ?";
        Object[] objects = {myOrder.getMyorderId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public List<MyOrder> select() {
        String sql = "select * from myorder";
        return this.jdbcTemplate.selectForList(sql,null);
    }


    @Override
    public MyOrder selectByPrimaryKey(int primaryKey) {
        String sql = "select * from myorder where order_id = ?";
        Object[] objects = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }

    @Override
    public List<MyOrder> selectByPage(PageUtil<MyOrder> page) {
        String sql = "select * from myorder limit ?,?";
        Object[] objects = {page.getStartRecord(),page.getPageSize()};
        return this.jdbcTemplate.selectForList(sql,objects);
    }

    @Override
    public int count() {
        return select().size();
    }
}
