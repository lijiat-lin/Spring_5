package com.lijiat.spring5.demo2.bean;


/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 16:39
 */
public class Emp {
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

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
