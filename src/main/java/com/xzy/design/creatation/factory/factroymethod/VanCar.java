package com.xzy.design.creatation.factory.factroymethod;

/**
 * 具体产品
 */
public class VanCar extends AbstractCar {

    public VanCar() {
        this.engine = "单缸柴油机";
    }

    @Override
    public void run() {
        System.out.println(engine + "dadaada");
    }
}
