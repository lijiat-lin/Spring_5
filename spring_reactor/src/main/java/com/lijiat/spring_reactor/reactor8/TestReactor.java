package com.lijiat.spring_reactor.reactor8;

import org.springframework.web.server.WebHandler;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @program: spring_reactor
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-21 15:20
 */
public class TestReactor {

    public static void main(String[] args) {


        // just方法可以直接声明相关的元素
        Flux.just(1,2,3,4).subscribe(System.out::print);
        Mono.just(1).subscribe(System.out::print);

        //声明数组元素
        Integer[] array = {1,2,3,4};
        Flux.fromArray(array);

        List<Integer> list = Arrays.asList(array);
        Flux.fromIterable(list);

        Stream<Integer> stream = list.stream();
        Flux.fromStream(stream);
    }
}
