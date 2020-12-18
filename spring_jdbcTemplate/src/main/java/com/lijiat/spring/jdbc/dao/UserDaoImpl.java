package com.lijiat.spring.jdbc.dao;

import com.lijiat.spring.jdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: spring_jdbcTemplate
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 13:51
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(User user) {
        String sql = "insert into t_user(user_name,user_phone) values(?,?)";
        Object[] args = {user.getUserName(), user.getUserPhone()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set user_name= ?,user_phone=? where id = ?";
        Object[] args = {user.getUserName(), user.getUserPhone(),user.getId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void delete(Integer id) {
        String sql = "delete from t_user where id = ?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(1) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public User selectById(Integer id) {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
        return user;
    }

    @Override
    public List<User> selectByList(User user) {
        String sql = "select * from t_user where user_phone = ?";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), user.getUserPhone());
        return userList;
    }

    @Override
    public void batchInsert(List<User> users) {
        String sql = "insert into t_user(user_name,user_phone) values(?,?)";
        List<Object[]> argsList = new ArrayList<>();
        for (User user:users){
            Object[] args = {user.getUserName(),user.getUserPhone()};
            argsList.add(args);
        }

        int[] ints = jdbcTemplate.batchUpdate(sql, argsList);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<User> users) {
        String sql = "update t_user set user_name= ?,user_phone=? where id = ?";
        List<Object[]> argsList = new ArrayList<>();
        for (User user:users){
            Object[] args = {user.getUserName(),user.getUserPhone(),user.getId()};
            argsList.add(args);
        }

        int[] ints = jdbcTemplate.batchUpdate(sql, argsList);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelete(List<Integer> ids) {
        String sql = "delete from t_user where id = ?";
        List<Object[]> argsList = new ArrayList<>();
        for (Integer id:ids){
            Object[] args = {id};
            argsList.add(args);
        }
        int[] ints = jdbcTemplate.batchUpdate(sql, argsList);
        System.out.println(Arrays.toString(ints));
    }
}
