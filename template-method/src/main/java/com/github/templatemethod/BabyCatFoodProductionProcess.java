package com.github.templatemethod;

/**
 * 猫奶糕生产流程
 *
 * @author bianxinhuan
 */
public class BabyCatFoodProductionProcess extends AbstractCatFoodProductionProcess {

    @Override
    protected void rawMaterialPreparation() {
        System.out.println("准备猫奶糕原材料 : 蛋黄、鸡肉、黄油、羊奶粉、动物内脏");
    }

    @Override
    protected void make() {
        System.out.println("开始制作猫奶糕");
    }

    @Override
    protected void packaging() {
        System.out.println("包装猫奶糕");
    }
}
