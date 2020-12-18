package com.lijiat.spring.aop.jdkproxy;

import java.lang.reflect.Proxy;

public class JdkProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userDao =(UserDao) Proxy.newProxyInstance(
                JdkProxy.class.getClassLoader(),
                interfaces,
                new UserDaoProxy(userDaoImpl));

        int add = userDao.add(10, 20);
        System.out.println(add);
    }
}
