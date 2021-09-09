package com.xzy.design.creatation.factory.factroymethod;

public class WulinMiniCarFactory extends AbatractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar();
    }
}
