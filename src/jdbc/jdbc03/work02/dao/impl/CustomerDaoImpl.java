package jdbc.jdbc03.work02.dao.impl;

import jdbc.jdbc03.work02.dao.CustomerDao;
import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.entity.Customer;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:38 PM
 */
public class CustomerDaoImpl implements CustomerDao {
    private JdbcTemplate<Customer> jdbcTemplate;
    public CustomerDaoImpl(JdbcTemplate<Customer> jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public int insert(Customer customer) {
        String sql = "insert into customer values(?,?)";
        Object[] objects = {customer.getUserId(),customer.getUserName()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(Customer customer) {
        String sql = "update customer set cust_name = ? where  cust_id = ?";
        Object[] objects={customer.getUserName(),customer.getUserId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(Customer customer) {
        String sql = "delete from customer where cust_id = ?";
        Object[] objects = {customer.getUserId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public List<Customer> select() {
        String sql = "select * from customer";
        return this.jdbcTemplate.selectForList(sql,null);
    }


    @Override
    public Customer selectByPrimaryKey(int primaryKey) {
        String sql = "select * from customer where cust_id = ?";
                Object[] objects = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }

    @Override
    public List<Customer> selectByPage(PageUtil<Customer> page) {
        String sql = "select * from customer limit ?,?";
        Object[] objects = {page.getStartRecord(),page.getPageSize()};
        return this.jdbcTemplate.selectForList(sql,objects);
    }

    @Override
    public int count() {
        return select().size();
    }

}
