package com.xzy.design.creatation.factory.abstractfactory;

/**
 * 分厂 负责口罩
 */
public class WulinWuhanMaskFactroy extends WulinFactory{
    @Override
    AbstractMask newMask() {
        return new N95Mask();
    }

    @Override
    AbstractCar newCar() {
        return null;
    }
}
