package com.lijiat.spring.aop;

import com.lijiat.spring.aop.annotation.UserService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-11 15:39
 */
public class GeneratorProxyClassTest {

    public static void main(String[] args) throws Exception{
        byte[] proxies = ProxyGenerator.generateProxyClass("$Proxy", new Class[]{UserService.class});
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\User.class");
        fileOutputStream.write(proxies);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
