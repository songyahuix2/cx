package jdbc.jdbc03.work02.serevice.impl;

import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.ReceiveAddressDao;
import jdbc.jdbc03.work02.dao.ReceiveAddressRowMapper;
import jdbc.jdbc03.work02.dao.impl.ReceiveAddressDaoImpl;
import jdbc.jdbc03.work02.entity.ReceiveAddress;
import jdbc.jdbc03.work02.entity.ReceiveAddress;
import jdbc.jdbc03.work02.serevice.ReceiveAddressService;
import jdbc.jdbc03.work02.util.PageUtil;

/**
 * @author shkstart
 * @date 8/19/2019 - 8:15 AM
 */
public class ReceiveAddressServiceImpl implements ReceiveAddressService {
    @Override
    public PageUtil<ReceiveAddress> getPage(int pagecode) {
        JdbcTemplate<ReceiveAddress> jdbcTemplate = new JdbcTemplate<>(new ReceiveAddressRowMapper());
        ReceiveAddressDaoImpl dao =  new ReceiveAddressDaoImpl(jdbcTemplate);
        PageUtil<ReceiveAddress> pageUtil = new PageUtil<>(pagecode);
        pageUtil.setTotalRecord(dao.count());
        pageUtil.setTotalPages((int) Math.ceil(dao.count()/pageUtil.getPageSize()));
        pageUtil.setModelList(dao.selectByPage(pageUtil));
        return pageUtil;
    }
}
