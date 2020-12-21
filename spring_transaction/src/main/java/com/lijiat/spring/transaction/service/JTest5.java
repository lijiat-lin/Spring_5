package com.lijiat.spring.transaction.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


/**
 * @program: spring_transaction
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-21 11:43
 */

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring/bean.xml")//加载配置文件

@SpringJUnitConfig(locations = "classpath:spring/bean.xml")
public class JTest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
