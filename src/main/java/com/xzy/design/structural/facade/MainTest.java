package com.xzy.design.structural.facade;

public class MainTest {
    public static void main(String[] args) {
        //不采用外观模式
        Poblic poblic = new Poblic();
        poblic.register("xie");
        Edu edu = new Edu();
        edu.assignSchool("xie");
        Social social = new Social();
        social.handleSocial("xie");

        // 外观和桥接？？外观和组合？？外观与装饰 感觉差不多呀

        // 采用外观模式 调用门面
        WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.handle("xie");

    }
}
