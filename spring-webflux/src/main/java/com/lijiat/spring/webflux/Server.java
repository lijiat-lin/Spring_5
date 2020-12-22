package com.lijiat.spring.webflux;

import com.lijiat.spring.webflux.handler.UserHandler;
import com.lijiat.spring.webflux.service.UserService;
import com.lijiat.spring.webflux.service.UserServiceImpl;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.http.server.reactive.ReactorHttpHandlerAdapter;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.netty.http.server.HttpServer;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.toHttpHandler;

/**
 * @program: spring-webflux
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-22 11:30
 */
public class Server {

    public static void main(String[] args) throws Exception{
        Server server = new Server();
        server.createReactorServer();
        System.out.println("enter to exit");
        System.in.read();

    }

    /**
     * 创建Router路由
     * @return
     */
    public RouterFunction<ServerResponse> routingFunction(){
        UserService userService = new UserServiceImpl();
        UserHandler handler = new UserHandler(userService);
        //设置路由
        return RouterFunctions.route(GET("/user").and(accept(APPLICATION_JSON)),handler::getAllUser)
                .andRoute(GET("/user/{id}").and(accept(APPLICATION_JSON)),handler::getUserById);
    }


    public void createReactorServer(){
        //路由和handler适配
        RouterFunction<ServerResponse> routerFunction = routingFunction();
        HttpHandler httpHandler = toHttpHandler(routerFunction);
        ReactorHttpHandlerAdapter adapter = new ReactorHttpHandlerAdapter(httpHandler);

        //创建服务器
        HttpServer httpServer = HttpServer.create();
        httpServer.handle(adapter).bindNow();

    }

}
