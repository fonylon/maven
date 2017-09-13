package pro.yf.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import pro.yf.bean.Demo;

/**
 * 功能：
 *
 * @author 天启 on 2017/8/31
 */
public class BeanFactoryTest{

    @Test
    public void init(){
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("spring-test.xml"));
        Demo demo = (Demo)beanFactory.getBean("demo");
        demo.doDemo();
    }
}
