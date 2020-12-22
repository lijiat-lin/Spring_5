package com.lijiat.spring.webflux;

import com.lijiat.spring.webflux.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @program: spring-webflux
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-22 14:27
 */
public class Client {

    public static void main(String[] args) {
        //调用服务器地址
        WebClient webClient = WebClient.create("http://127.0.0.1:56115");

        String id = "1";
        User user = webClient.get().uri("/user/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class)
                .block();
        System.out.println(user);

        Flux<User> userFlux = webClient.get().uri("/user").accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);

        userFlux.map(user1 -> user1.getName()).buffer().doOnNext(System.out::println).blockFirst();

    }
}
