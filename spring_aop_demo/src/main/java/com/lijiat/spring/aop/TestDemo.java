package com.lijiat.spring.aop;

import com.lijiat.spring.aop.annotation.User;
import com.lijiat.spring.aop.config.ConfigAop;
import com.lijiat.spring.aop.xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 10:24
 */

public class TestDemo {

    @Test
    public void testAop(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user",User.class);
        user.add();
    }

    @Test
    public void testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean1.xml");
        Book book = context.getBean("book",Book.class);
        book.read();
    }
}
