package com.github.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 支付工厂类，简化创建支付策略的步骤
 *
 * @author bianxinhuan
 */
public class PayStrategyFactory {

    private static Map<String, PayStrategy> payStrategyMap = new HashMap<>();

    static {
        payStrategyMap.put("aliPay", new AliPay());
        payStrategyMap.put("wechatPay", new WechatPay());
    }

    public static PayStrategy getPayStrategy(String payCode) {
        return payStrategyMap.get(payCode);
    }

}
