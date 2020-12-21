package com.lijiat.spring.webflux.service;

import com.lijiat.spring.webflux.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> getUserById(Integer id);

    Flux<User> getAllUser();

    Mono<Void> saveUserInfo(Mono<User> userMono);
}
