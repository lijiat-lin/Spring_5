package com.lijiat.spring5.demo2.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @program: spring5_demo1
 * @description:
 * @author: zhangjialin
 * @create: 2020-12-16 17:12
 */
public class Student {
    private String[] courses;

    private List<String> list;

    private Map<String,String> map;

    private Set<String> set;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courseList=" + courseList +
                '}';
    }
}
