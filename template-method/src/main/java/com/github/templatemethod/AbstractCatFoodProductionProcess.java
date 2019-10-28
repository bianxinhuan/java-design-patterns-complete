package com.github.templatemethod;

/**
 * 猫粮生产流程
 *
 * @author bianxinhuan
 */
public abstract class AbstractCatFoodProductionProcess {

    /**
     * 准备原材料
     */
    protected abstract void rawMaterialPreparation();

    /**
     * 制作
     */
    protected abstract void make();

    /**
     * 包装
     */
    protected abstract void packaging();

    /**
     * 生产方法
     */
    public final void production() {

        rawMaterialPreparation();

        make();

        packaging();
    }

}
