package jdbc.jdbc03.work02.serevice.impl;

import jdbc.jdbc03.work02.dao.*;
import jdbc.jdbc03.work02.dao.impl.MyOrderDaoImpl;
import jdbc.jdbc03.work02.dao.impl.OrderDetailDaoImpl;
import jdbc.jdbc03.work02.entity.MyOrder;
import jdbc.jdbc03.work02.entity.OrderDetail;
import jdbc.jdbc03.work02.serevice.OrderDetailService;
import jdbc.jdbc03.work02.util.PageUtil;

/**
 * @author shkstart
 * @date 8/19/2019 - 12:38 AM
 */
public class OrderDetailServiceImpl implements OrderDetailService {

    @Override
    public PageUtil<OrderDetail> getPage(int pagecode) {
        JdbcTemplate<OrderDetail> jdbcTemplate = new JdbcTemplate<>(new OrderDetailRowMapper());
        OrderDetailDao dao = new OrderDetailDaoImpl(jdbcTemplate);
        PageUtil<OrderDetail> pageUtil = new PageUtil<>(pagecode);
        pageUtil.setTotalRecord(dao.count());
        pageUtil.setTotalPages((int) Math.ceil(dao.count()/pageUtil.getPageSize()));
        pageUtil.setModelList(dao.selectByPage(pageUtil));
        return pageUtil;

    }

}
