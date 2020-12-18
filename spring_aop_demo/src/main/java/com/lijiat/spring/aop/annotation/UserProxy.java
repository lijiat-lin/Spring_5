package com.lijiat.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 10:12
 */
@Component
@Aspect
@Order(2)
public class UserProxy {

    @Pointcut(value = "execution(* com.lijiat.spring.aop.annotation.User.add(..))")
    private void pointDemo(){
    }


    /**
     * Before 注解就是前置通知
     */
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before。。。");
    }

    @After(value = "execution(* com.lijiat.spring.aop.annotation.User.add(..))")
    public void after(){
        System.out.println("after。。。");
    }

    @AfterReturning(value = "execution(* com.lijiat.spring.aop.annotation.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning。。。");
    }


    @AfterThrowing(value = "execution(* com.lijiat.spring.aop.annotation.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing。。。");
    }

    @Around(value = "execution(* com.lijiat.spring.aop.annotation.User.add(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("around  before...");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("around  after...");
        return proceed;
    }
}
