package com.lijiat.spring.transaction.dao;

import com.lijiat.spring.transaction.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @program: spring_transaction
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 15:56
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void updateAmount(Account account) {
        String sql = "update t_account set amount = amount + ? where id = ?";
        int update = jdbcTemplate.update(sql, account.getAmount(), account.getId());
        System.out.println(update);
    }
}
