package com.lijiat.spring.aop;


import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.lijiat.spring.aop.annotation.UserService;
import com.lijiat.spring.aop.annotation.UserServiceImpl;
import com.lijiat.spring.aop.config.ConfigAop;
import com.lijiat.spring.aop.entity.User;
import com.lijiat.spring.aop.xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.concurrent.*;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 10:24
 */

public class TestDemo {

    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        UserService user = context.getBean("userService", UserService.class);
        user.add();


    }

    @Test
    public void testAopUserService(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        UserServiceImpl user = context.getBean("userServiceImpl", UserServiceImpl.class);
        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean1.xml");
        Book book = context.getBean("book",Book.class);
        book.read();
    }




}
