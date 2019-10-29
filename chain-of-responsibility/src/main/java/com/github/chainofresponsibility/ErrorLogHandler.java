package com.github.chainofresponsibility;

/**
 * -
 *
 * @author bianxinhuan
 */
public class ErrorLogHandler extends LogHandler {
    @Override
    protected LogLevel getLogLevel() {
        return LogLevel.ERROR;
    }

    @Override
    protected void log(LogLevel logLevel, String message) {
        System.out.println("ERROR : " + message);
    }
}
