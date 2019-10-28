package com.github.strategy;

import java.math.BigDecimal;

/**
 * 支付策略
 *
 * @author bianxinhuan
 */
public interface PayStrategy {

    /**
     * 支付
     *
     * @param price 价格
     */
    void pay(BigDecimal price);

}
