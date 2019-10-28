package com.github.strategy;

import java.math.BigDecimal;

/**
 * -
 *
 * @author bianxinhuan
 */
public class AliPay implements PayStrategy {
    @Override
    public void pay(BigDecimal price) {
        System.out.println("支付宝支付: " + price.setScale(2, BigDecimal.ROUND_DOWN) + "元");
    }
}
