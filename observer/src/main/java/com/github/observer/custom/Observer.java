package com.github.observer;

/**
 * 观察者接口
 *
 * @author bianxinhuan
 */
public interface Observer {
    /**
     * 更新
     *
     * @param message 消息
     */
    void update(String message);
}
