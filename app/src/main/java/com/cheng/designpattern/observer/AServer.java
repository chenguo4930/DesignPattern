package com.cheng.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChengGuo
 * @date 2019/3/12
 */
public class AServer implements Observerable {
    private List<Observer> observers;
    private String msg;

    public AServer() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unRegisterObserver(Observer o) {
        if (!observers.isEmpty()) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(msg);
        }
    }
}
