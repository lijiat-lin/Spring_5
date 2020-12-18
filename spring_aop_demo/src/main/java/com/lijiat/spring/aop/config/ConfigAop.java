package com.lijiat.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-18 11:14
 */
@Configuration
@ComponentScan(basePackages = {"com.lijiat.spring.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
