package com.github.strategy;

import java.math.BigDecimal;

/**
 * -
 *
 * @author bianxinhuan
 */
public class WechatPay implements PayStrategy {
    @Override
    public void pay(BigDecimal price) {
        System.out.println("微信支付: " + price.setScale(2, BigDecimal.ROUND_DOWN) + "元");
    }
}
