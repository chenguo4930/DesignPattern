package com.cheng.designpattern.Observer;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public interface Observerable {

    void registerObserver(Observer o);

    void unRegisterObserver(Observer o);

    void notifyObserver();
}
