package com.lijiat.spring.aop.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-11 16:13
 */
@Component
public class UserServiceImpl implements BeanNameAware, BeanFactoryAware {
    public void add(){
        System.out.println("com.lijiat.spring.aop.annotation.UserServiceImpl.add");
    }

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }
}
