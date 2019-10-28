package com.github.decorator;

import java.math.BigDecimal;

/**
 * 猫咖
 *
 * @author bianxinhuan
 */
public interface CatCoffee {

    /**
     * 描述
     *
     * @return
     */
    String description();

    /**
     * 价格
     *
     * @return
     */
    BigDecimal price();

}
