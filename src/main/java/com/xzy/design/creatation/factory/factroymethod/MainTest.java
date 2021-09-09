package com.xzy.design.creatation.factory.factroymethod;

public class MainTest {
    public static void main(String[] args) {
        AbatractCarFactory carFactory = new WulinRacingCarFactory();
        AbstractCar abstractCar = carFactory.newCar();
        abstractCar.run();

        carFactory = new WulinVanCarFactory();
        AbstractCar abstractCar1 = carFactory.newCar();
        abstractCar1.run();
    }
}
