package com.xzy.design.creatation.factory.abstractfactory;

public class WulinVanCarFactory extends WulinFactory {


    @Override
    AbstractMask newMask() {
        return null;
    }

    @Override
    AbstractCar newCar() {
        return new VanCar();
    }
}
