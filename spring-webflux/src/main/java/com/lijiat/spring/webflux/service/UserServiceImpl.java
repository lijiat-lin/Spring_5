package com.lijiat.spring.webflux.service;

import com.lijiat.spring.webflux.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-webflux
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-21 17:38
 */
@Service
public class UserServiceImpl implements UserService {

    private final Map<Integer,User> map = new HashMap<>();

    public UserServiceImpl(){
        this.map.put(1,new User("luck","女",20));
        this.map.put(2,new User("mary","男",21));
        this.map.put(3,new User("jack","女",22));
        this.map.put(4,new User("kobe","男",23));
        this.map.put(5,new User("curry","女",24));
    }

    @Override
    public Mono<User> getUserById(Integer id) {
        return Mono.justOrEmpty(this.map.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(map.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {

        return userMono.doOnNext(user -> {
            //向map中放值
            int id = map.size()+1;
            map.put(id,user);
        }).thenEmpty(Mono.empty());
    }
}
