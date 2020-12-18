package com.lijiat.spring.jdbc.dao;

import com.lijiat.spring.jdbc.entity.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    void delete(Integer id);

    int selectCount();

    User selectById(Integer id);

    List<User> selectByList(User user);

    void batchInsert(List<User> users);

    void batchUpdate(List<User> users);

    void batchDelete(List<Integer> ids);
}
