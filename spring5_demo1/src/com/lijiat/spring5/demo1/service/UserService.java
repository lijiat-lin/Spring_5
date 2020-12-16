package com.lijiat.spring5.demo1.service;

import com.lijiat.spring5.demo1.dao.UserDao;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 16:25
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service.UserService.add");
        userDao.add();
    }
}
