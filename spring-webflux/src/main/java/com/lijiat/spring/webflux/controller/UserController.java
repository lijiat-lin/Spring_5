package com.lijiat.spring.webflux.controller;

import com.lijiat.spring.webflux.entity.User;
import com.lijiat.spring.webflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @program: spring-webflux
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-21 18:00
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/user")
    public Flux<User> getAllUser(){
        return userService.getAllUser();
    }

    @PostMapping("/user/add")
    public Mono<Void> saveUser(@RequestBody User user){
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }
}
