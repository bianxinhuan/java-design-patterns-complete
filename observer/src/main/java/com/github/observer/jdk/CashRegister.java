package com.github.observer.jdk;

import java.util.Observable;

/**
 * 收银机-使用JDK提供的被观察者接口Observable实现
 *
 * @author bianxinhuan
 */
public class CashRegister extends Observable {

    /**
     * 客户付款
     */
    public void pay() {
        System.out.println("收银机: 收到客户付款");
        // 必须设置为已修改，才可以通知到观察者，在Observable中对changed字段做了判断
        setChanged();
        super.notifyObservers("收银机付款");
    }

}
