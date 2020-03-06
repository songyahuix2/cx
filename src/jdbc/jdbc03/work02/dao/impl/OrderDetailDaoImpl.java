package jdbc.jdbc03.work02.dao.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.OrderDetailDao;
import jdbc.jdbc03.work02.entity.OrderDetail;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:42 PM
 */
public class OrderDetailDaoImpl implements OrderDetailDao {
private JdbcTemplate<OrderDetail> jdbcTemplate;
public OrderDetailDaoImpl(JdbcTemplate<OrderDetail> jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
}
    @Override
    public int insert(OrderDetail orderDetail) {
        String sql = "insert into order_detail values(?,?,?)";
        Object[] objects = {orderDetail.getOrder_id(),orderDetail.getPro_id(),orderDetail.getQuantity()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(OrderDetail orderDetail) {
    String sql = "update order_detail quality = ? where order_id = ? and pro_id = ?";
    Object[] objects = {orderDetail.getQuantity(),orderDetail.getOrder_id(),orderDetail.getPro_id()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(OrderDetail orderDetail) {
    String sql = "delete from order_detail where order_id = ? and pro_id = ?";
        Object[] objects = {orderDetail.getOrder_id(),orderDetail.getPro_id()};
    return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public List<OrderDetail> select() {
    String sql = "select * from order_detail";
        return this.jdbcTemplate.selectForList(sql,null);
    }

    @Override
    public OrderDetail selectByPrimaryKey(int primaryKey) {
        return null;
    }


    public OrderDetail selectByPrimaryKey(int order_id,int pro_id) {
        String sql = "select * from order_detail where order_id = ? and pro_id = ?";
        Object[] objects = {order_id,pro_id};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }


    @Override
    public List<OrderDetail> selectByPage(PageUtil<OrderDetail> page) {
    String sql = "select * from order_detail limit ?,?";
    Object[] objects = {page.getStartRecord(),page.getPageSize()};
        return this.jdbcTemplate.selectForList(sql,objects);
    }

    @Override
    public int count() {
        return this.select().size();
    }
}
