package com.cheng.designpattern.singleton;

/**
 * 枚举单例
 *
 * 有点：写法简单/线程安全
 */
public enum  EnumSingleton {
    //定义一个枚举的元素，它就是Singleton的一个实例
    INSTANCE;

    public void doSomeThing(){
        //do something
    }
}
