package com.xzy.design.creatation.factory.factroymethod;

public class WulinVanCarFactory extends AbatractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new VanCar();
    }
}
