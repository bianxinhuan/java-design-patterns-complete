package com.github.abstractfactory.factory;

import com.github.abstractfactory.catfood.AbstractCatFood;
import com.github.abstractfactory.catfood.BabyCatFood;

/**
 * 猫奶糕工厂
 *
 * @author bianxinhuan
 */
public class BabyCatFoodFactory extends AbstractCatFoodFactory {
    @Override
    public AbstractCatFood produce() {
        return new BabyCatFood();
    }
}
