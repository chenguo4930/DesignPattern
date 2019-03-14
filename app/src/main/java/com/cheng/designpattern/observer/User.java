package com.cheng.designpattern.observer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class User implements Observer {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(String name) {
        this.name = name;
    }
}
