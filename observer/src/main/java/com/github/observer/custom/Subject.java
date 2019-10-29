package com.github.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象观察者
 *
 * @author bianxinhuan
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
