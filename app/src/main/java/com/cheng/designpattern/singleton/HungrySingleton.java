package com.cheng.designpattern.singleton;

/**
 * 饿汉模式
 *
 *  不足：无法对instance实例做延时加载
 *  优化：懒汉
 */
public class HungrySingleton {

    private static final HungrySingleton mHungrySingleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getHungurySingleton(){
        return mHungrySingleton;
    }
}
