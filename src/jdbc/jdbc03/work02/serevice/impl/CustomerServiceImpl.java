package jdbc.jdbc03.work02.serevice.impl;

import jdbc.jdbc03.work02.dao.CustomerDao;
import jdbc.jdbc03.work02.dao.CustomerRowMapper;
import jdbc.jdbc03.work02.dao.JdbcTemplate;
import jdbc.jdbc03.work02.dao.impl.CustomerDaoImpl;
import jdbc.jdbc03.work02.entity.Customer;
import jdbc.jdbc03.work02.serevice.CustomerService;
import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 10:13 PM
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public PageUtil<Customer> getPage(int pagecode) {
        JdbcTemplate<Customer> jdbcTemplate = new JdbcTemplate<>(new CustomerRowMapper());
        CustomerDao dao = new CustomerDaoImpl(jdbcTemplate);
        PageUtil<Customer> page  = new PageUtil<>(pagecode);//没有传页码 默认第一页
        int totalRecord = dao.count();//获得总记录数
        page.setTotalRecord(totalRecord);//设置总记录数到PageUtil
        page.setTotalPages((int)Math.ceil(totalRecord/page.getPageSize()));//设置总页码到PageUtil
        //2.调用dao 数据库查询，开始分页查询
        List<Customer> Customers = dao.selectByPage(page);
        //3.封装页码信息+数据集合
        page.setModelList(Customers);
        System.out.println(page.toString());
        return page;
    }
}
