package com.lijiat.spring.transaction;

import com.lijiat.spring.transaction.config.TransactionConfig;
import com.lijiat.spring.transaction.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;

/**
 * @program: spring_transaction
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 15:54
 */
public class TestTransaction {
    private static Logger LOG = LoggerFactory.getLogger(TestTransaction.class);

    @Nullable
    private String name;

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

    @Test
    public void testGenericApplicationContext(){
        // 1 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 2 调用context的方法对象注册
        context.refresh();
//        context.registerBean(UserService.class,() -> new UserService());
//        //3 获取在spring注册的对象
//        UserService userService = (UserService) context.getBean("com.lijiat.spring.transaction.service.UserService");
        context.registerBean("userService",UserService.class,() -> new UserService());
        //3 获取在spring注册的对象
        UserService userService = (UserService) context.getBean("userService");
        System.out.println(userService);
    }
}
