package jdbc.jdbc03.work02.serevice.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.ProductDao;
import jdbc.jdbc03.work02.dao.ProductRowMapper;
import jdbc.jdbc03.work02.dao.impl.ProductDaoImpl;
import jdbc.jdbc03.work02.entity.Product;
import jdbc.jdbc03.work02.entity.Product;
import jdbc.jdbc03.work02.serevice.ProductService;
import jdbc.jdbc03.work02.util.PageUtil;

/**
 * @author shkstart
 * @date 8/19/2019 - 8:10 AM
 */
public class ProductServiceImpl implements ProductService {
    @Override
    public PageUtil<Product> getPage(int pagecode) {
        JdbcTemplate<Product> jdbcTemplate = new JdbcTemplate<>(new ProductRowMapper());
        ProductDao dao = new ProductDaoImpl(jdbcTemplate);
        PageUtil<Product> pageUtil = new PageUtil<>(pagecode);
        pageUtil.setTotalRecord(dao.count());
        pageUtil.setTotalPages((int) Math.ceil(dao.count()/pageUtil.getPageSize()));
        pageUtil.setModelList(dao.selectByPage(pageUtil));
        return pageUtil;
    }
}
