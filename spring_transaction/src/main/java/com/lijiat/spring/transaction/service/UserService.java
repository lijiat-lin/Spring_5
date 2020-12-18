package com.lijiat.spring.transaction.service;

import com.lijiat.spring.transaction.dao.UserDao;
import com.lijiat.spring.transaction.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: spring_transaction
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 15:56
 */
@Service
//@Transactional(rollbackFor = Exception.class)
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){


            //张三减少100元
            Account account = new Account(1,100);
            userDao.updateAmount(account);

            //模拟异常
            int i = 10 / 0;

            //李四多100元
            Account account1 = new Account(2,-100);
            userDao.updateAmount(account1);

    }
}
