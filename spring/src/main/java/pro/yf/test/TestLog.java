package pro.yf.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 功能：
 *
 * @author 天启 on 2017/8/30
 */
public class TestLog {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger("test");
        logger.error("error");
    }
}
