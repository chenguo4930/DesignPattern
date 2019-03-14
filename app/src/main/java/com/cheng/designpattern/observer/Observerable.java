package com.cheng.designpattern.observer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public interface Observerable {

    void registerObserver(Observer o);

    void unRegisterObserver(Observer o);

    void notifyObserver();
}
