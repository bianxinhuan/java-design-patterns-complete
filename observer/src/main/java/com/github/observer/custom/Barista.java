package com.github.observer.custom;

/**
 * 咖啡师
 *
 * @author bianxinhuan
 */
public class Barista implements Observer {
    @Override
    public void update(String message) {
        System.out.println("咖啡师收到消息: " + message + ", 开始制作咖啡");
    }
}
