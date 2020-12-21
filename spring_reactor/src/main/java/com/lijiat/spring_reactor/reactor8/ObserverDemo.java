package com.lijiat.spring_reactor.reactor8;


import java.util.Observable;

/**
 * @program: spring_reactor
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-21 14:39
 */
public class ObserverDemo extends Observable {

    public static void main(String[] args) {
        ObserverDemo observerDemo = new ObserverDemo();
        //添加观察者
        observerDemo.addObserver((o,arg) -> {
            System.out.println("发生变化");
        });

        observerDemo.addObserver((o,arg) -> {
            System.out.println("被观察者通知消息，准备改变");
        });
        //数据变化
        observerDemo.setChanged();
        //通知
        observerDemo.notifyObservers();

    }
}
