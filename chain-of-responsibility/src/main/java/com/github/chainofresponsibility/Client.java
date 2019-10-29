package com.github.chainofresponsibility;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = getLogHandlerChain();

        logHandler.handle(LogLevel.ERROR, "ERROR MESSAGE");
        logHandler.handle(LogLevel.DEBUG, "DEBUG MESSAGE");
        logHandler.handle(LogLevel.INFO, "INFO MESSAGE");
    }

    private static LogHandler getLogHandlerChain() {
        LogHandler infoLogHandler = new InfoLogHandler();
        LogHandler debugLogHandler = new DebugLogHandler();
        LogHandler errorLogHandler = new ErrorLogHandler();

        infoLogHandler.setNextHandler(debugLogHandler);
        debugLogHandler.setNextHandler(errorLogHandler);
        return infoLogHandler;
    }
}
