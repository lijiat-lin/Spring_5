package com.lijiat.spring5.demo1;

import com.lijiat.spring5.demo1.entity.Book;
import com.lijiat.spring5.demo1.entity.Order;
import com.lijiat.spring5.demo1.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 11:36
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();

    }

    @Test
    public void testBook(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        book.testDemo();

    }

    @Test
    public void testOrder(){
        //1 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Order order = context.getBean("order", Order.class);
        order.sout();

    }
}
