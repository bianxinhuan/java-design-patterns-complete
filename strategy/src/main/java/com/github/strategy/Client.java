package com.github.strategy;

import java.math.BigDecimal;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        PayContext payContext = new PayContext(PayStrategyFactory.getPayStrategy("aliPay"));

        payContext.pay(new BigDecimal(199.99));
    }
}
