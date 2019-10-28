package com.github.factorymethod;

/**
 * 猫粮工厂
 *
 * @author bianxinhuan
 */
public class CatFoodFactory {

    /**
     * 生产猫粮
     *
     * @param name
     * @return
     */
    public static AbstractCatFood produce(String name) {
        switch (name) {
            case "babyCatFood":
                return new BabyCatFood();
            case "kettyCatFood":
                return new KettyCatFood();
            default:
                return null;
        }
    }

}
