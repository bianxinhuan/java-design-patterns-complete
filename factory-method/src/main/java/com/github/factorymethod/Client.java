package com.github.factorymethod;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        AbstractCatFood catFood = CatFoodFactory.produce("babyCatFood");
        System.out.println(catFood.catFoodName());

        catFood = CatFoodFactory.produce("kettyCatFood");
        System.out.println(catFood.catFoodName());
    }
}
