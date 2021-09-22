package com.xzy.design.structural.proxy.cglib;

public class CglibTest {
    //记得引入依赖
    public static void main(String[] args) {
        //使用cglib原来的对象都不用new(这个暂时不大明白？？？？？？？？？？？？？？？？？？？？
        XieTikTok tikTok =  new XieTikTok();
        // 此时对象tikTok没有接口，不能用jdk 故用cglib代理，

        tikTok.haha();
        XieTikTok proxy = CglibProxy.createProxy(tikTok);
        proxy.haha();
    }
}
