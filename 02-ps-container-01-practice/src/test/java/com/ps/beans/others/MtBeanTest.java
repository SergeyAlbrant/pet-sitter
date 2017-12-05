package com.ps.beans.others;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by iuliana.cosmina on 3/26/16.
 */
public class MtBeanTest {

    private Logger logger = LoggerFactory.getLogger(MtBeanTest.class);

    @Test
    public void testConfig() {
       /* ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath:spring/others/factory-config.xml",
                "classpath:spring/others/collections-config.xml",
                "classpath:spring/others/custom-editors-config.xml",
                "classpath:spring/others/multiple-types-config.xml");*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/others/*-config.xml");

        MultipleTypesBean mtBean = (MultipleTypesBean) ctx.getBean("mtBean");
        assertNotNull(mtBean);

        CollectionHolder collectionHolder = (CollectionHolder) ctx.getBean("collectionHolder");
        assertNotNull(collectionHolder);

        SimpleSingleton simpleSingleton = (SimpleSingleton) ctx.getBean("simpleSingleton");
        assertNotNull(simpleSingleton);
    }
}
