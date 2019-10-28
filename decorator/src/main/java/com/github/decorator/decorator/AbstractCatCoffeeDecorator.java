package com.github.decorator.decorator;

import com.github.decorator.CatCoffee;

import java.math.BigDecimal;

/**
 * 抽象咖啡装饰器
 *
 * @author bianxinhuan
 */
public class AbstractCatCoffeeDecorator implements CatCoffee {
    private CatCoffee catCoffee;

    public AbstractCatCoffeeDecorator(CatCoffee catCoffee) {
        this.catCoffee = catCoffee;
    }

    @Override
    public String description() {
        return catCoffee.description();
    }

    @Override
    public BigDecimal price() {
        return catCoffee.price();
    }
}
