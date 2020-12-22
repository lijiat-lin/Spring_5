package com.lijiat.spring.webflux.handler;

import com.lijiat.spring.webflux.entity.User;
import com.lijiat.spring.webflux.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @program: spring-webflux
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-22 10:10
 */
public class UserHandler {

    private final UserService userService;
    public UserHandler(UserService userService){
        this.userService = userService;
    }

    public Mono<ServerResponse> getUserById(ServerRequest serverRequest){
        int userId = Integer.valueOf(serverRequest.pathVariable("id"));
        //空值处理
        Mono<ServerResponse> responseMono = ServerResponse.notFound().build();
        //调用server方法得到数据
        Mono<User> userMono = this.userService.getUserById(userId);

        return userMono.flatMap(person -> ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
        .body(person,User.class)).switchIfEmpty(responseMono);
    }

    public Mono<ServerResponse> getAllUser(ServerRequest serverRequest){
        Flux<User> userFlux = this.userService.getAllUser();
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(userFlux,User.class);
    }

    public Mono<ServerResponse> saveUserInfo(ServerRequest serverRequest){
        Mono<User> userMono = serverRequest.bodyToMono(User.class);
        return ServerResponse.ok().build(this.userService.saveUserInfo(userMono));
    }
}
