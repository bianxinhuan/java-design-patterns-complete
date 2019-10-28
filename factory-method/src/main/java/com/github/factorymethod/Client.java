package com.github.factorymethod;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        AbstractCatFood catFood = CatFoodFactory.production("babyCatFood");
        System.out.println(catFood.catFoodName());

        catFood = CatFoodFactory.production("kettyCatFood");
        System.out.println(catFood.catFoodName());
    }
}
