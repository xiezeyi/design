package com.xzy.design.creatation.factory.abstractfactory;

public class WulinHangZhouMaskFactory extends WulinFactory {

    @Override
    AbstractMask newMask() {
        return new CommonMask();
    }

    @Override
    AbstractCar newCar() {
        return null;
    }
}
