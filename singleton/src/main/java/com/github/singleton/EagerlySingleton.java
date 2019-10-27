package com.github.singleton;

/**
 * 饿汉模式：类加载时初始化静态实例保证线程安全。
 *
 * @author bianxinhuan
 */
public final class EagerlySingleton {

    /**
     * 类的静态实例
     */
    private static final EagerlySingleton INSTANCE = new EagerlySingleton();

    /**
     * 私有构造函数
     */
    private EagerlySingleton() {
    }

    public static EagerlySingleton getInstance() {
        return INSTANCE;
    }
}
