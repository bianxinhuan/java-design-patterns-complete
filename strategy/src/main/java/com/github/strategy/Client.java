package com.github.strategy;

import java.math.BigDecimal;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {

        PayContext payContext = new PayContext(getPayStrategy("aliPay"));

        payContext.pay(new BigDecimal(199.99));
    }

    private static PayStrategy getPayStrategy(String payCode) {
        PayStrategy payStrategy;
        if ("aliPay".equals(payCode)) {
            return new AliPay();
        }
        if ("wechatPay".equals(payCode)) {
            return new WechatPay();
        }
        throw new IllegalArgumentException("不支持支付方式");
    }
}
