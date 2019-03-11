package com.cheng.designpattern.singleton;

/**
 * 懒汉线程安全f模式
 *
 * 不足：性能
 * 优化：DCL
 */
public class LazySafeSingleton {

    private static LazySafeSingleton mInstance;

    private LazySafeSingleton(){

    }

    /**
     * 方法中声明synchronized 关键字
     */
    public static synchronized LazySafeSingleton getInstance(){
        //第一次调用，初始化
        if (mInstance == null){
            mInstance = new LazySafeSingleton();
        }
        return mInstance;
    }

    /**
     * 同步代码块中实现
     */
    public static LazySafeSingleton getInstance2(){
        synchronized (LazySafeSingleton.class){
            if (mInstance == null){
                mInstance = new LazySafeSingleton();
            }
        }
        return mInstance;
    }

}
