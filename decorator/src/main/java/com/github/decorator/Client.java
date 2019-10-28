package com.github.decorator;

import com.github.decorator.decorator.BobaDecorator;
import com.github.decorator.decorator.OatsDecorator;
import com.github.decorator.decorator.PearlDecorator;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        CatCoffee catCoffee = new MilkTea();

        // 加珍珠
        catCoffee = new PearlDecorator(catCoffee);
        // 加波霸
        catCoffee = new BobaDecorator(catCoffee);
        // 燕麦
        catCoffee = new OatsDecorator(catCoffee);

        System.out.println(catCoffee.description() + ", 价格: " + catCoffee.price());
    }
}
