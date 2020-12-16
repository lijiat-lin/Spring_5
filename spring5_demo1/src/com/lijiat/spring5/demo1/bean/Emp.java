package com.lijiat.spring5.demo1.bean;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 16:39
 */
public class Emp {
    private String name;
    private String gender;
    /**
     * 一个员工要属于某一个部门
     */
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
