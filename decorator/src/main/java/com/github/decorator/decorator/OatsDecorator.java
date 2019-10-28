package com.github.decorator.decorator;

import com.github.decorator.CatCoffee;

import java.math.BigDecimal;

/**
 * 燕麦装饰器
 *
 * @author bianxinhuan
 */
public class OatsDecorator extends AbstractCatCoffeeDecorator {
    public OatsDecorator(CatCoffee catCoffee) {
        super(catCoffee);
    }

    @Override
    public String description() {
        return super.description() + "|加燕麦(4元)";
    }

    @Override
    public BigDecimal price() {
        return super.price().add(BigDecimal.valueOf(4));
    }
}
