package com.github.facade;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.create("幼猫猫粮", "18827182718");
    }
}
