package com.github.facade;

/**
 * -
 *
 * @author bianxinhuan
 */
public class ProductService {

    /**
     * 减库存
     */
    public void reduceStock(String productName) {
        System.out.println("减少商品[" + productName + "]库存成功");
    }

}
