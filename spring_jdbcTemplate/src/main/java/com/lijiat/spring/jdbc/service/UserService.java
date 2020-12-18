package com.lijiat.spring.jdbc.service;

import com.lijiat.spring.jdbc.dao.UserDao;
import com.lijiat.spring.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: spring_jdbcTemplate
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 13:50
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user){
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(Integer id){
        userDao.delete(id);
    }

    public int selectCount() {
        return userDao.selectCount();
    }

    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    public List<User> selectByList(User user) {
        return userDao.selectByList(user);
    }

    public void batchInsert(List<User> users) {
        userDao.batchInsert(users);
    }


    public void batchUpdate(List<User> users) {
        userDao.batchUpdate(users);
    }


    public void batchDelete(List<Integer> ids) {
        userDao.batchDelete(ids);
    }
}
