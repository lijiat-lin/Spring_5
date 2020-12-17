package com.lijiat.spring5.demo2.bean;

public class Orders {
    private String name;

    Orders(){
        System.out.println("第一步：执行无参数构造方法创建bean对象");
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("第二步：设置set方法设置属性");
    }

    public void initMethod(){
        System.out.println("第三步：执行初始化的方法");
    }

    public void destroyMethod(){
        System.out.println("第五步：销毁对象的方法");
    }


    @Override
    public String toString() {
        return "Orders{" +
                "name='" + name + '\'' +
                '}';
    }
}
