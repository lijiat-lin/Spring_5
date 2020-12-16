package com.lijiat.spring5.demo2.factory;


import com.lijiat.spring5.demo2.collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 18:49
 */
public class MyBean implements FactoryBean<Course> {

    /**
     * 定义返回类对象
     * @return
     * @throws Exception
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("语文");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
