package com.lijiat.spring5.demo2;

import com.lijiat.spring5.demo2.collection.Student;
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
}
