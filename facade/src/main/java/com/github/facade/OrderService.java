package com.github.facade;

/**
 * 订单外观
 *
 * @author bianxinhuan
 */
public class OrderService {

    private ProductService productService = new ProductService();

    private SmsService smsService = new SmsService();

    public void create(String productName, String phone) {
        System.out.println("创建订单");
        productService.reduceStock(productName);
        smsService.sendSms(phone);
    }
}
