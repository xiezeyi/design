package com.xzy.design.creatation.factory.factroymethod;

public class RacingCar extends AbstractCar {

    public RacingCar() {
        this.engine = "v8发动机";

    }

    @Override
    public void run() {
        System.out.println(engine+ "sssssss");
    }
}
