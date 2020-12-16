package com.lijiat.spring5.demo2.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 18:49
 */
public class MyBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
