package com.cheng.designpattern.singleton;

/**
 * DCL
 *
 * 不足：JVM的即时编译器中存在指令重排序的优化
 * 优化：静态内部类/枚举
 */
public class DclSingleton {
    /**
     * 使用volatile防止指令重排序
     */
    private static volatile DclSingleton mInstance;

    private DclSingleton() {

    }

    public static  DclSingleton getInstance() {
        //避免不必要的同步
        if (mInstance == null) {
            //同步
            synchronized (DclSingleton.class){
                if (mInstance == null){
                    mInstance = new DclSingleton();
                }
            }
        }
        return mInstance;
    }

}
