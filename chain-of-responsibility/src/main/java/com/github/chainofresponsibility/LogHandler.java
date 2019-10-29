package com.github.chainofresponsibility;

/**
 * 抽象处理器
 *
 * @author bianxinhuan
 */
public abstract class LogHandler {

    private LogHandler next;

    /**
     * 获取日志级别
     *
     * @return
     */
    protected abstract LogLevel getLogLevel();

    /**
     * 设置下一个处理器
     *
     * @param handler
     */
    public void setNextHandler(LogHandler handler) {
        this.next = handler;
    }

    /**
     * 处理
     */
    public void handle(LogLevel logLevel, String message) {
        // 只处理当前级别的日志
        if (getLogLevel().equals(logLevel)) {
            log(logLevel, message);
        }
        // 流转到下一个处理器处理
        if (next != null) {
            next.handle(logLevel, message);
        }
    }

    /**
     * 输出日志
     *
     * @param logLevel
     * @param message
     */
    protected abstract void log(LogLevel logLevel, String message);
}
