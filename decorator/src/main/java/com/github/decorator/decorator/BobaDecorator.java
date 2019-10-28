package com.github.decorator.decorator;

import com.github.decorator.CatCoffee;

import java.math.BigDecimal;

/**
 * 波霸装饰器
 *
 * @author bianxinhuan
 */
public class BobaDecorator extends AbstractCatCoffeeDecorator {
    public BobaDecorator(CatCoffee catCoffee) {
        super(catCoffee);
    }

    @Override
    public String description() {
        return super.description() + "|加波霸(免费)";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.ZERO);
    }
}
