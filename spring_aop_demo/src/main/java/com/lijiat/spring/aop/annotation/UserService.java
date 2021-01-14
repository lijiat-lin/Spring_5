package com.lijiat.spring.aop.annotation;

import org.springframework.stereotype.Component;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 10:11
 */
@Component
public class UserService {
    public void add(){
        System.out.println("com.lijiat.spring.aop.annotation.UserService.add");
    }
}
