package com.xzy.design.creatation.factory.abstractfactory;

import java.util.List;

/**
 * 总厂
 */
public abstract class WulinFactory {

    List<String> rules;

    abstract AbstractMask newMask();

    abstract AbstractCar newCar();
}
