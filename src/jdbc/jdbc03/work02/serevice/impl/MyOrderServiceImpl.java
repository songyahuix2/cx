package jdbc.jdbc03.work02.serevice.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.MyOrderDao;
import jdbc.jdbc03.work02.dao.MyOrderRowMapper;
import jdbc.jdbc03.work02.dao.impl.MyOrderDaoImpl;
import jdbc.jdbc03.work02.entity.MyOrder;
import jdbc.jdbc03.work02.serevice.MyOrderService;
import jdbc.jdbc03.work02.util.PageUtil;

/**
 * @author shkstart
 * @date 8/19/2019 - 12:25 AM
 */
public class MyOrderServiceImpl implements MyOrderService {
    @Override
    public PageUtil<MyOrder> getPage(int pagecode) {
        JdbcTemplate<MyOrder> jdbcTemplate = new JdbcTemplate<>(new MyOrderRowMapper());
        MyOrderDao dao = new MyOrderDaoImpl(jdbcTemplate);
        PageUtil<MyOrder> pageUtil = new PageUtil<>(pagecode);
        pageUtil.setTotalRecord(dao.count());
        pageUtil.setTotalPages((int) Math.ceil(dao.count()/pageUtil.getPageSize()));
        pageUtil.setModelList(dao.selectByPage(pageUtil));
        return pageUtil;
    }
}
