package jdbc.jdbc03.work02.dao.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.ProductDao;
import jdbc.jdbc03.work02.entity.Product;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 6:43 PM
 */
public class ProductDaoImpl implements ProductDao {
    private JdbcTemplate<Product> jdbcTemplate;
    public ProductDaoImpl(JdbcTemplate<Product> jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Product product) {
        String sql = "insert into product values(?,?,?)";
        Object[] objects = {product.getProductId(),product.getProductName(),product.getProductPrice()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int update(Product product) {
        String sql = "update product set pro_name = ?,pro_price = ? where pro_id = ?";
        Object[] objects = {product.getProductName(),product.getProductPrice(),product.getProductId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public int delete(Product product) {
        String sql = "delete from product where pro_id = ?";
        Object[] objects = {product.getProductId()};
        return this.jdbcTemplate.update(sql,objects);
    }

    @Override
    public List<Product> select() {
        String sql = "select * from product";
        return this.jdbcTemplate.selectForList(sql,null);
    }

    @Override
    public Product selectByPrimaryKey(int primaryKey) {
        String sql = "select * from product where pro_id = ?";
        Object[] objects = {primaryKey};
        return this.jdbcTemplate.selectForObject(sql,objects);
    }

    @Override
    public List<Product> selectByPage(PageUtil<Product> page) {
        String sql = "select * from product limit ?,?";
        Object[] objects = {page.getStartRecord(),page.getPageSize()};
        return this.jdbcTemplate.selectForList(sql,objects);
    }

    @Override
    public int count() {
        return this.select().size();
    }
}
