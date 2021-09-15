package com.xzy.design.creatation.factory.abstractfactory;

/**
 * 具体工厂  只造车
 */
public class WulinRacingCarFactroy extends WulinFactory{
    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new RacingCar();
    }
}
