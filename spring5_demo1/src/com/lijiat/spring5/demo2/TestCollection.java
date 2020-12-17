package com.lijiat.spring5.demo2;

import com.lijiat.spring5.demo2.bean.Emp;
import com.lijiat.spring5.demo2.bean.Orders;
import com.lijiat.spring5.demo2.collection.Book;
import com.lijiat.spring5.demo2.collection.Course;
import com.lijiat.spring5.demo2.collection.Student;
import com.lijiat.spring5.demo2.factory.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 17:27
 */
public class TestCollection {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Student student = context.getBean("student",Student.class);
        System.out.println(student.toString());
    }


    @Test
    public void testBooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("books",Book.class);

        Book book1 = context.getBean("books",Book.class);
        System.out.println(book);
        System.out.println(book1);
    }


    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Course myBean = context.getBean("myBean", Course.class);
        System.out.println(myBean);

    }

    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步：获取了实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);

    }
}
