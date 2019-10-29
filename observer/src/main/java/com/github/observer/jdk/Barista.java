package com.github.observer.jdk;


import java.util.Observable;
import java.util.Observer;

/**
 * 咖啡师-使用JDK提供的观察者Observer实现
 *
 * @author bianxinhuan
 */
public class Barista implements Observer {
    @Override
    public void update(Observable o, Object args) {
        System.out.println("咖啡师收到消息: " + args + ", 开始制作咖啡");
    }
}
