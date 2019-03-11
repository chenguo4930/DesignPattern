package com.cheng.designpattern.singleton;

/**
 * 静态内部类
 *
 * 优化：最优 JVM本身机制保证了线程安全，没有缺陷
 * 外部类加载时并不需要立即加载内部类，内部类不被加载则不去初始化INSTANCE，故而不占内存。即当SingleTon第一次被加载时，并不需要去加载SingleTonHoler，只有当getInstance()方法第一次被调用时，才会去初始化INSTANCE,第一次调用getInstance()方法会导致虚拟机加载SingleTonHoler类，这种方法不仅能确保线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化。
 * -------
 * 原文：https://blog.csdn.net/mnb65482/article/details/80458571
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton(){

    }

     private static class InnerClass{
        private static final StaticInnerSingleton mmInstance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance(){
        return InnerClass.mmInstance;
    }

}
