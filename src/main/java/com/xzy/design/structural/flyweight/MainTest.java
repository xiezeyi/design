package com.xzy.design.structural.flyweight;

public class MainTest {
    public static void main(String[] args) {
        AbstractWaitressFlyweight waitress = ZuDao.getWaitress("");
        waitress.service();
        System.out.println("waitress = " + waitress);
        AbstractWaitressFlyweight waitress1 = ZuDao.getWaitress("");
        waitress1.service();
        System.out.println("waitress1 = " + waitress1);
        AbstractWaitressFlyweight waitress2 = ZuDao.getWaitress("");
        waitress2.service();
        System.out.println("waitress2 = " + waitress2);
    }
}
