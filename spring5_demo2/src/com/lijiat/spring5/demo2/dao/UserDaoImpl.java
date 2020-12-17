package com.lijiat.spring5.demo2.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: spring5_demo2
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-17 16:58
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("Dao.add()");
    }
}
