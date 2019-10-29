package com.github.chainofresponsibility;

/**
 * -
 *
 * @author bianxinhuan
 */
public class InfoLogHandler extends LogHandler {
    @Override
    protected LogLevel getLogLevel() {
        return LogLevel.INFO;
    }

    @Override
    protected void log(LogLevel logLevel, String message) {
        System.out.println("INFO : " + message);
    }
}
