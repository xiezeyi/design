package com.xzy.design.creatation.factory.factroymethod;

public class WulinRacingCarFactory extends AbatractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
