package com.github.abstractfactory.factory;

import com.github.abstractfactory.catfood.AbstractCatFood;

/**
 * 抽象猫粮工厂
 *
 * @author bianxinhuan
 */
public abstract class AbstractCatFoodFactory {

    /**
     * 生产猫粮
     *
     * @return
     */
    public abstract AbstractCatFood produce();

}
