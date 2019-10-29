package com.github.observer.custom;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        // 收银机：具体的被观察者
        CashRegister cashRegister = new CashRegister();

        // 咖啡师：观察者
        Observer barista = new Barista();

        // 添加观察者
        cashRegister.addObserver(barista);

        // 收银机收到用户付款
        cashRegister.pay();
    }
}
