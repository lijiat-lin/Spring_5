package com.lijiat.spring5.demo1;

import com.lijiat.spring5.demo1.bean.Emp;
import com.lijiat.spring5.demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 16:34
 */
public class TestBean {
    @Test
    public void testAdd(){

        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testDept(){

        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp.toString());
    }
}
