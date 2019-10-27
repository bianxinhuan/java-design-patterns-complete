package com.github.singleton;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {

        EagerlySingleton instance = EagerlySingleton.getInstance();
        EagerlySingleton instance2 = EagerlySingleton.getInstance();

        System.out.println(instance == instance2);
    }
}
