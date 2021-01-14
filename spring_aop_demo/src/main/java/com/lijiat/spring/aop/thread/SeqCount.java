package com.lijiat.spring.aop.thread;

import com.lijiat.spring.aop.entity.User;

/**
 * @program: spring_aop_demo
 * @description:
 * @author: zhangjialin
 * @create: 2021-01-12 18:42
 */
public class SeqCount {

    private static User user = new User();

    private static ThreadLocal<User> userThreadLocal = new ThreadLocal<User>(){

        @Override
        protected User initialValue() {
            return user;
        }
    };

    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

    public User nextUser(){
        userThreadLocal.get().setAge(userThreadLocal.get().getAge()+10);
        return userThreadLocal.get();
    }


    public static void main(String[] args) {
        SeqCount seqCount = new SeqCount();

        SeqThread thread1 = new SeqThread(seqCount);
        SeqThread thread2 = new SeqThread(seqCount);
        SeqThread thread3 = new SeqThread(seqCount);
        SeqThread thread4 = new SeqThread(seqCount);
        SeqThread thread5 = new SeqThread(seqCount);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    private static class SeqThread extends Thread{
        private SeqCount seqCount;

        SeqThread(SeqCount seqCount){
            this.seqCount = seqCount;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+"***seqCount:"+seqCount.nextUser().getAge());
        }
    }
}
