package com.github.templatemethod;

/**
 * -
 *
 * @author bianxinhuan
 */
public class Client {

    public static void main(String[] args) {
        AbstractCatFoodProductionProcess productionProcess = new BabyCatFoodProductionProcess();
        productionProcess.production();

        productionProcess = new KittyCatFoodProductionProcessImpl();
        productionProcess.production();
    }
}
