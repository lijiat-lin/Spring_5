package com.lijiat.spring5.demo2;

import com.lijiat.spring5.demo2.config.SpringConfig;
import com.lijiat.spring5.demo2.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5_demo2
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-17 15:32
 */
public class TestDemo2 {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }


    @Test
    public void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
