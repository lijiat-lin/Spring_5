package com.lijiat.spring5.demo1.dao.impl;

import com.lijiat.spring5.demo1.dao.UserDao;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 16:26
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao.impl.UserDaoImpl.add");
    }
}
