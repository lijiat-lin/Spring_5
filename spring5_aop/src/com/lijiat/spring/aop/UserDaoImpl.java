package com.lijiat.spring.aop;

public class UserDaoImpl implements  UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("执行add方法");
        return a+b;
    }

    @Override
    public String update(String s) {
        return "Hello"+s;
    }
}
