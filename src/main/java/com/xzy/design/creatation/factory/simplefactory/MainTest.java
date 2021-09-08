package com.xzy.design.creatation.factory.simplefactory;

public class MainTest {
    public static void main(String[] args) {
        WuliSimpleFactory factory = new WuliSimpleFactory();

        AbstractCar van = factory.newCar("van");
        van.run();
        AbstractCar mini = factory.newCar("mini");
        mini.run();
        AbstractCar zz = factory.newCar("zz");
        zz.run();
    }
}
