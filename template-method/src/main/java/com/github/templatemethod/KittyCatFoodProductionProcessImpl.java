package com.github.templatemethod;

/**
 * 幼猫猫粮
 *
 * @author bianxinhuan
 */
public class KittyCatFoodProductionProcessImpl extends AbstractCatFoodProductionProcess {

    @Override
    protected void rawMaterialPreparation() {
        System.out.println("准备猫奶糕原材料 : 蛋黄、鸡肉、黄油、动物内脏");
    }

    @Override
    protected void make() {
        System.out.println("开始制作幼猫猫粮");
    }

    @Override
    protected void packaging() {
        System.out.println("包装幼猫猫粮");
    }
}
