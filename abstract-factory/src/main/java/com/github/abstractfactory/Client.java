package com.github.abstractfactory;

import com.github.abstractfactory.catfood.AbstractCatFood;
import com.github.abstractfactory.factory.AbstractCatFoodFactory;
import com.github.abstractfactory.factory.BabyCatFoodFactory;
import com.github.abstractfactory.factory.KettyCatFoodFactory;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        // 猫奶糕工厂
        AbstractCatFoodFactory catFoodFactory = new BabyCatFoodFactory();
        AbstractCatFood catFood = catFoodFactory.produce();
        System.out.println("生产: " + catFood.catFoodName());

        // 幼猫猫粮工厂
        catFoodFactory = new KettyCatFoodFactory();
        catFood = catFoodFactory.produce();
        System.out.println("生产: " + catFood.catFoodName());
    }
}
