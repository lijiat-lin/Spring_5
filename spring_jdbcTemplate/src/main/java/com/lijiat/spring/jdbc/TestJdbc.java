package com.lijiat.spring.jdbc;

import com.lijiat.spring.jdbc.entity.User;
import com.lijiat.spring.jdbc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring_jdbcTemplate
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 14:12
 */
public class TestJdbc {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Integer> ids = new ArrayList<>();
        for (int i = 20; i <= 25; i++) {
           ids.add(i);
        }
        userService.batchDelete(ids);




    }
}
