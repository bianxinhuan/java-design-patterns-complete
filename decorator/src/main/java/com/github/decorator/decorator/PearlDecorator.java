package com.github.decorator.decorator;

import com.github.decorator.CatCoffee;

import java.math.BigDecimal;

/**
 * 珍珠装饰器
 *
 * @author bianxinhuan
 */
public class PearlDecorator extends AbstractCatCoffeeDecorator {

    public PearlDecorator(CatCoffee catCoffee) {
        super(catCoffee);
    }

    @Override
    public String description() {
        return super.description() + "|加珍珠(免费)";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.ZERO);
    }
}
