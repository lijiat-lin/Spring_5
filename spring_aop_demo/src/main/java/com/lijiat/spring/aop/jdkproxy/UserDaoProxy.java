package com.lijiat.spring.aop.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 创建代理对象代码
 */
public class UserDaoProxy implements InvocationHandler {

    private Object obj;

    /**
     * 把创建的是UserDaoImpl的代理对象  所以需要将UserDaoImpl传递过来
     * 有参构造传递
     * @param obj
     */
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    /**
     * 增强的逻辑
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法执行之前---Method："+method.getName()+" args:"+ Arrays.toString(args));

        //方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法执行之后---obj:"+obj);
        return res;
    }
}
