package com.interface21.test;

import com.interface21.beans.factory.xml.XmlBeanFactory;

import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertTrue;

public class Test1 {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(
                "E:\\mj-project\\spring-framework-2003\\interface21-framework\\src\\test\\java\\com\\interface21\\beans\\factory\\xml\\reftypes.xml");
        XmlBeanFactory xbf = new XmlBeanFactory(is);
        assertTrue("6 beans in reftypes, not " + xbf.getBeanDefinitionCount(), xbf.getBeanDefinitionCount() == 6);
        TestBean jen = (TestBean) xbf.getBean("jenny");
        TestBean dave = (TestBean) xbf.getBean("david");
        TestBean jenks = (TestBean) xbf.getBean("jenks");


    }


}
