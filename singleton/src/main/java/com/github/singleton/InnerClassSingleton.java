package com.github.singleton;

/**
 * 内部类实现的单例
 *
 * @author bianxinhuan
 */
public class InnerClassSingleton {

    /**
     * 私有构造函数
     */
    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }
}
