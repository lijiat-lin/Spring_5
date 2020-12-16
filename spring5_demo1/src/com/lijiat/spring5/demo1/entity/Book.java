package com.lijiat.spring5.demo1.entity;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 14:57
 */
public class Book {
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void testDemo(){
        System.out.println(name);
        System.out.println(author);
    }
}
