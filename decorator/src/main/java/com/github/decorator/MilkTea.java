package com.github.decorator;

import java.math.BigDecimal;

/**
 * 奶茶
 *
 * @author bianxinhuan
 */
public class MilkTea implements CatCoffee {
    @Override
    public String description() {
        return "奶茶";
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.valueOf(10);
    }
}
