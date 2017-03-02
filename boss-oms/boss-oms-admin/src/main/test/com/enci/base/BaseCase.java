package com.enci.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * Created by Kayuu on 2017/3/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:applicationContext*.xml",
        "classpath:applicationContext-dubbo-consumer.xml"
})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class BaseCase {
}
