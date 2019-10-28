package com.github.templatemethod;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {

    public static void main(String[] args) {
        AbstractCatFoodProductionProcess productionProcess = new BabyCatFoodProductionProcess();
        productionProcess.produce();

        productionProcess = new KittyCatFoodProductionProcessImpl();
        productionProcess.produce();
    }
}
