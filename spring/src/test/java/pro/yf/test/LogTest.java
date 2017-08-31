package pro.yf.test;

import org.junit.Test;
import pro.yf.util.GlobalUtils;

/**
 * 功能：
 *
 * @author 天启 on 2017/8/31
 */
public class LogTest {

    @Test
    public void testLog(){
        GlobalUtils.LOGGER.error("test log");
    }
}
