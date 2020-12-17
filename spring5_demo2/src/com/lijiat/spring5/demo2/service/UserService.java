package com.lijiat.spring5.demo2.service;

import com.lijiat.spring5.demo2.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 注解的value可以不写   不写默认是类的名称的首字母小写
 * @program: spring5_demo2
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-17 16:02
 */
@Service(value = "userService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(){
        System.out.println("com.lijiat.spring5.demo2.service.UserService.add");
        userDao.add();
    }
}
