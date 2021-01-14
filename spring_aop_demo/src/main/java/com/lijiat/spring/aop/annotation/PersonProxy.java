package com.lijiat.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 10:47
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {


    @Before(value = "execution(* com.lijiat.spring.aop.annotation.UserService.add(..))")
    public void before(){
        System.out.println("Person.before");
    }
}
