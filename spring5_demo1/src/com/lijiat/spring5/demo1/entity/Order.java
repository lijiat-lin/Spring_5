package com.lijiat.spring5.demo1.entity;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 15:06
 */
public class Order {
    private String  name;
    private String address;
    private Integer price;

    public Order(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Order(String name, String address, Integer price) {
        this.name = name;
        this.address = address;
        this.price = price;
    }

    public void sout(){
        System.out.println(name);
        System.out.println(address);
    }
}
