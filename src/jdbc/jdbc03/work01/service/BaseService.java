package jdbc.jdbc03.work01.service;

import jdbc.jdbc03.work02.util.PageUtil;

/**
 * @author shkstart
 * @date 8/17/2019 - 8:34 PM
 */
public interface BaseService<T> {
    public PageUtil<T> getPage(int pageCode);
}
