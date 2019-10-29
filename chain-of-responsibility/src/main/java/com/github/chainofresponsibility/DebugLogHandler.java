package com.github.chainofresponsibility;

/**
 * -
 *
 * @author bianxinhuan
 */
public class DebugLogHandler extends LogHandler {
    @Override
    protected LogLevel getLogLevel() {
        return LogLevel.DEBUG;
    }

    @Override
    protected void log(LogLevel logLevel, String message) {
        System.out.println("DEBUG : " + message);
    }
}
