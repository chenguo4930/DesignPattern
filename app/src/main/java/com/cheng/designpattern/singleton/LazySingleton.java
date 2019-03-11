package com.cheng.designpattern.singleton;

/**
 * 懒汉模式
 *
 * 不足：多线程并发情况下，不能保证实例的唯一性
 * 优化：懒汉线程安全
 */
public class LazySingleton {

    private static LazySingleton mInstance;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        //第一次调用，初始化
        if (mInstance == null){
            mInstance = new LazySingleton();
        }
        return mInstance;
    }

}
