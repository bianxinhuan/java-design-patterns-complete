package com.github.observer.custom;

/**
 * 收银机
 *
 * @author bianxinhuan
 */
public class CashRegister extends Subject {

    /**
     * 客户付款
     */
    public void pay() {
        System.out.println("收银机: 收到客户付款");
        super.notifyObservers("收银机付款");
    }

}
