package jdbc.jdbc03.work02.serevice;

import jdbc.jdbc03.work02.util.PageUtil;

import java.util.List;

/**
 * @author shkstart
 * @date 8/18/2019 - 9:57 PM
 */
public interface BaseService<T> {
    PageUtil<T> getPage(int pagecode);
}
