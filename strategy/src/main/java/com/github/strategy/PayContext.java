package com.github.strategy;

import java.math.BigDecimal;

/**
 * 策略上下文
 *
 * @author bianxinhuan
 */
public class PayContext {

    private PayStrategy payStrategy;

    public PayContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void pay(BigDecimal price) {
        payStrategy.pay(price);
    }
}
