package com.lijiat.spring5.demo2.collection;

/**
 * @program: spring5_demo1
 * @description: 课程类
 * @author: zhangjialin
 * @create: 2020-12-16 17:39
 */
public class Course {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
