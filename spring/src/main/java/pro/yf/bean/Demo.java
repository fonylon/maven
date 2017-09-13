package pro.yf.bean;

import pro.yf.util.GlobalUtils;

/**
 * 功能：
 *
 * @author 天启 on 2017/8/31
 */
public class Demo {
    public void doDemo() {
        System.out.println("demo done");
        GlobalUtils.LOGGER.error("error");
    }
}
