package com.github.abstractfactory.factory;

import com.github.abstractfactory.catfood.AbstractCatFood;
import com.github.abstractfactory.catfood.KettyCatFood;

/**
 * 幼猫猫粮工厂
 *
 * @author bianxinhuan
 */
public class KettyCatFoodFactory extends AbstractCatFoodFactory {
    @Override
    public AbstractCatFood produce() {
        return new KettyCatFood();
    }
}
