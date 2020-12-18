package com.lijiat.spring.transaction;

import com.lijiat.spring.transaction.config.TransactionConfig;
import com.lijiat.spring.transaction.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_transaction
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 15:54
 */
public class TestTransaction {

    @Test
    public void testAccount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    @Test
    public void testXml(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }
}
