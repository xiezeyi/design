package com.xzy.design.creatation.factory.simplefactory;

/**
 * 简单工厂
 * 1.产品数量极少
 */
public class WuliSimpleFactory {

    public AbstractCar newCar(String type) {

        // 核心 一切从简
        if ("van".equals(type)) {
            return new VanCar();
        } else if ("mini".equals(type)) {
            return new MiniCar();
        }
        return null;
    }
}
